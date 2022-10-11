package com.harunaydin.iocli_dili;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "ioclidiliCalisan")
@ApplicationScoped
public class Calisan {
    @Inject
    private IPatron patronInterface;

    // parametresiz constructor
    public Calisan(){
        patronInterface = new Patron();
    }

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
