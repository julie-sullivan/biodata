package org.opencb.biodata.tools.feature;

import htsjdk.samtools.SAMFileHeader;
import htsjdk.samtools.SAMSequenceRecord;
import org.junit.Test;
import org.opencb.biodata.models.core.Region;
import org.opencb.biodata.tools.alignment.BamUtils;
import org.opencb.biodata.tools.commons.ChunkFrequencyManager;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by imedina on 25/11/16.
 */
public class BigWigManagerTest {

    @Test
    public void query() throws Exception {
        // this reads a file from src/test/resources folder
        Path inputPath = Paths.get(getClass().getResource("/wigVarStepExampleSmallChr21.bw").toURI());

        BigWigManager bigWigManager = new BigWigManager(inputPath);
        Region region = new Region("chr21", 9411190, 9411290);
        float[] chr21 = bigWigManager.query(region);

        int start = region.getStart();
        for (float v: chr21) {
            System.out.println((start++) + " :" + v);
        }

        assertEquals(region.getEnd() - region.getStart() + 1, chr21.length);
    }

    @Test
    public void index() throws Exception {
        // this reads a file from src/test/resources folder
        Path bamPath = Paths.get(getClass().getResource("/HG00096.chrom20.small.bam").toURI());
        Path bwPath = Paths.get(getClass().getResource("/wigVarStepExampleSmallChr21.bw").toURI());
        Path dbPath = Paths.get(bamPath + ".db");

//        Path bamPath = Paths.get("/home/jtarraga/data150/bam/NA12877_chr1.bam");
//        Path bwPath = Paths.get("/home/jtarraga/data150/bam/wgEncodeBroadHistoneH1hescH4k20me1StdSig.bigWig");
//        Path dbPath = Paths.get(bwPath + ".db");

        dbPath.toFile().delete();


        // now, we can index
        BigWigManager bigWigManager = new BigWigManager(bwPath);
        dbPath = bigWigManager.index();

//        Region region = new Region("chr21", 10000000 - 1000, 10001000 - 1000);
//        float[] values = bigWigManager.query(region);
//        int total = 0;
//        for (float v : values) {
//            System.out.println(v);
//            total += v;
//        }
//        System.out.println("**** mean = " + (total / 1000));
//

        // initialize chunkFrequencyManager and DB to query
        int chunkSize = 1000;
        ChunkFrequencyManager chunkFrequencyManager = new ChunkFrequencyManager(dbPath, chunkSize);
        Region region = new Region("chr21", 10000000 - 1000, 10001000 - 1000);
        ChunkFrequencyManager.ChunkFrequency res = chunkFrequencyManager.query(region, bwPath, 1000);
        for (short i : res.getValues()) {
            System.out.println("---> " + i);
        }

        //        // this reads a file from src/test/resources folder
//        Path inputPath = Paths.get(getClass().getResource("/wigVarStepExampleSmallChr21.bw").toURI());
//
//        BigWigManager bigWigManager = new BigWigManager(inputPath);
//        List<Float> chr21 = bigWigManager.query(new Region("chr21", 9411190, 9411291));
//        bigWigManager.close();
//
//        assertEquals(20, chr21.size());
    }

}