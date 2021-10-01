package com.example;

public class SoyaDiseaseSampleTypeClassifierHandler 
    extends AbstractSampleTypeClassifierHandler {
    
    public SampleType classify(Sample aSample) {

        if (aSample.getOccurrenceType().startsWith("Soya Disease")) {
            return SampleType.SOYA_DISEASE;

        } else {
            return super.classify(aSample);
        }
    
    }
}
