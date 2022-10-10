package com.harunaydin.bean;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;


@Named(value = "cdiBean")
@RequestScoped
@Setter
@Getter
public class JsfBean{

    private String patika;

    public JsfBean() {
        patika = "Spring boot eğitimine hoş geldiniz.";
    }


}
