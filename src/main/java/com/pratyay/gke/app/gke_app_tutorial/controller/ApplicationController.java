package com.pratyay.gke.app.gke_app_tutorial.controller;

import com.pratyay.gke.app.gke_app_tutorial.model.PatientTo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping(path = "/root")
public class ApplicationController {

    @GetMapping("/allpatients")
    public List<PatientTo> getAllPatientsNames(){
        List<PatientTo> allPatients= new ArrayList<>();
        allPatients.add(PatientTo.builder().firstName("Pratyay").lastName("Das").age(35).address("Rahara").build());
        return allPatients;
    }

}
