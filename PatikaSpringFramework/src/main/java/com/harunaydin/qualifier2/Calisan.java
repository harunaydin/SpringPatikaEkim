package com.harunaydin.qualifier2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi2")
@ApplicationScoped
public class Calisan {

    /*
    @Inject
    private IPatron patronInterface;
     */


    @Inject
    @QualifierMultiple2(EFazlaSecenekler.BIRINCI)
    private IPatron patronInterface;

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
