package com.harunaydin.qualifier;

import javax.enterprise.inject.Default;

@Default
public class Patron1 implements IPatron {

    @Override
    public String surum(String data) {
        return "default data: " + data;
    }

}
