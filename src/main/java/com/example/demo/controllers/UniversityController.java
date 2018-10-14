package com.example.demo.controllers;

import com.example.demo.domains.UniversityDetails;
import com.example.demo.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {

    @Autowired
    UniversityService universityService;

    @GetMapping("/details")
    public ResponseEntity getDetails(@RequestParam("name") int name, @RequestParam("country") String country){

        ResponseEntity<UniversityDetails[]> details = universityService.getDetails();
        return new ResponseEntity(details, HttpStatus.OK);

    }
}
