package com.harunaydin.iocli_dili;

public class Patron implements IPatron{

    @Override
    public String surum(String data) {
        return "sürüm: " + data;
    }

}
