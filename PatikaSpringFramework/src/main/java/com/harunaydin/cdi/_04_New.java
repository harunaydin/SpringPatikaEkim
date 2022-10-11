package com.harunaydin.cdi;


import com.harunaydin.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New implements Serializable {

    // Üretilen
    @Produces
    public String uretilenData(@New StudentDto studentDto){
        studentDto = StudentDto.builder().studentId(0L).stundetName("Harun").studentSurname("Aydın").build();
        return studentDto.getStudentSurname();
    }

    @Getter
    @Inject
    private String tuketilenData;


}
