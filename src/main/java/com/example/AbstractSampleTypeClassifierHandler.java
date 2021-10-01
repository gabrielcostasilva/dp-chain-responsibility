package com.example;

public abstract class AbstractSampleTypeClassifierHandler 
    implements ISampleTypeClassifierHandler {

    private ISampleTypeClassifierHandler nextHandler;

    public ISampleTypeClassifierHandler setNext(final ISampleTypeClassifierHandler aHandler) {
        this.nextHandler = aHandler;
        return this.nextHandler;
    }
    
    public SampleType classify(final Sample aSample) {

        if (this.nextHandler != null) {
            return this.nextHandler.classify(aSample);
            
        } else {
            return null;
        }
    }
}
