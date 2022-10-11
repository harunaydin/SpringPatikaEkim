package com.harunaydin.qualifier;

public interface IPatron {

    //@Qualifier'da aynı anda birden fazla proje aktif ancak default olarak çalışacak projeyi seçebiliris
    public String surum(String data);
}
