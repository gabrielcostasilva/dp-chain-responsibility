package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testPest() {
        
        var classifier = new ClassifySampleType();

        var aSample = new Sample("Soya Pest");

        assertEquals(SampleType.SOYA_PEST, classifier.classify(aSample));
        assertNotEquals(SampleType.SOYA_DISEASE, classifier.classify(aSample));
        assertNotEquals(SampleType.SOYA_PULVERISATION, classifier.classify(aSample));
        
    }

    @Test
    public void testDisease() {
        
        var classifier = new ClassifySampleType();

        var aSample = new Sample("Soya Disease");

        assertEquals(SampleType.SOYA_DISEASE, classifier.classify(aSample));
        assertNotEquals(SampleType.SOYA_PEST, classifier.classify(aSample));
        assertNotEquals(SampleType.SOYA_PULVERISATION, classifier.classify(aSample));
    }

    @Test
    public void testPulv() {
        
        var classifier = new ClassifySampleType();

        var aSample = new Sample("Soya Pulv");

        assertEquals(SampleType.SOYA_PULVERISATION, classifier.classify(aSample));
        assertNotEquals(SampleType.SOYA_DISEASE, classifier.classify(aSample));
        assertNotEquals(SampleType.SOYA_PEST, classifier.classify(aSample));
    }

    @Test
    public void testNone() {
        
        var classifier = new ClassifySampleType();

        var aSample = new Sample("Something else");

        assertNull(classifier.classify(aSample));
    }    

}
