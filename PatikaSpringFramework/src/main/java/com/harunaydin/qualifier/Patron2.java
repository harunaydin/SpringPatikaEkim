package com.harunaydin.qualifier;

@QualifierMultiple
public class Patron2 implements IPatron {

    @Override
    public String surum(String data) {
        return "QualifierMultiple1: " + data;
    }

}
