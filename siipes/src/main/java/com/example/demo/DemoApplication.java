package com.example.demo;

import dao.VilleRepository;
import entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  {

    /*
    @Autowired
    private final VilleRepository vr;
    public DemoApplication(VilleRepository vr) {


    this.vr = vr;
    }
*/

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }



}

