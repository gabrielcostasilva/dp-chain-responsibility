package com.example;

public class SoyaPestSampleTypeClassifierHandler 
    extends AbstractSampleTypeClassifierHandler {

    public SampleType classify(Sample aSample) {

        if (aSample.getOccurrenceType().startsWith("Soya Pest")) {
            return SampleType.SOYA_PEST;

        } else {
            return super.classify(aSample);
        }
    }
    
}
