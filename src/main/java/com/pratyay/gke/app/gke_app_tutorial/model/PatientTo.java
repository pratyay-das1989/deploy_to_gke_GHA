package com.pratyay.gke.app.gke_app_tutorial.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class PatientTo implements Serializable {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

}
