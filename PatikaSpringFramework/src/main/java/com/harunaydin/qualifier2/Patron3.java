package com.harunaydin.qualifier2;

@QualifierMultiple2(EFazlaSecenekler.IKINCI)
public class Patron3 implements IPatron {

    @Override
    public String surum(String data) {
        return "QualifierMultiple İKİNCİ Patron3: " + data;
    }

}
