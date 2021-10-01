package com.example;

public class ClassifySampleType {

    public SampleType classify(final Sample aSample) {

        var pestHandler = new SoyaPestSampleTypeClassifierHandler();
        var diseaseHandler = new SoyaDiseaseSampleTypeClassifierHandler();
        var pulvHandler = new SoyaPulverisationSampleTypeClassifierHandler();

        pestHandler
            .setNext(diseaseHandler)
            .setNext(pulvHandler);

        return pestHandler.classify(aSample);
    }
    
}
