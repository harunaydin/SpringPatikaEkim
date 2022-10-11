package com.harunaydin.alternative;


import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;

@Alternative
public class Patron1 implements IPatron {

    @Override
    public String surum(String data) {
        return "patron1: " + data;
    }

}
