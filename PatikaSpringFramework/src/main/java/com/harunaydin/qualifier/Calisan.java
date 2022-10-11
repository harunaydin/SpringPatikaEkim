package com.harunaydin.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {

    @Inject
    @QualifierMultiple
    private IPatron patronInterface;

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
