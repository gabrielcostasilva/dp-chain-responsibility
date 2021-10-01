package com.example;

public class SoyaPulverisationSampleTypeClassifierHandler 
    extends AbstractSampleTypeClassifierHandler {
    
    public SampleType classify(Sample aSample) {

        if (aSample.getOccurrenceType().startsWith("Soya Pulv")) {
            return SampleType.SOYA_PULVERISATION;

        } else {
            return super.classify(aSample);
        }
    }
}
