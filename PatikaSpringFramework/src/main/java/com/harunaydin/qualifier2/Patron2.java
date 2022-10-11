package com.harunaydin.qualifier2;

@QualifierMultiple2(EFazlaSecenekler.BIRINCI)
public class Patron2 implements IPatron {

    @Override
    public String surum(String data) {
        return "QualifierMultiple BİRİNCİ Patron2: " + data;
    }

}
