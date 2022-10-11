package com.harunaydin.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativedi")
@ApplicationScoped
public class Calisan {

    @Inject
    private IPatron patronInterface;

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
