package com.example.companycountryassignmentapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.*")
public class CompanyCountryAssignmentAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanyCountryAssignmentAppApplication.class, args);
    }

}
