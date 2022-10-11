package com.harunaydin.qualifier2;

@QualifierMultiple2(EFazlaSecenekler.UCUNCU)
public class Patron4 implements IPatron {

    @Override
    public String surum(String data) {
        return "QualifierMultiple ÜÇÜNCÜ Patron4: " + data;
    }

}
