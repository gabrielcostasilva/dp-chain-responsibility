package com.example;

public sealed interface ISampleTypeClassifierHandler 
    permits AbstractSampleTypeClassifierHandler {

    public ISampleTypeClassifierHandler setNext(ISampleTypeClassifierHandler aHandler);
    public SampleType classify(Sample aSample);
}
