package com.example;

public interface ISampleTypeClassifierHandler {

    public ISampleTypeClassifierHandler setNext(ISampleTypeClassifierHandler aHandler);
    public SampleType classify(Sample aSample);
}
