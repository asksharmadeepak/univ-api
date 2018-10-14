package com.example.demo.services;

import com.example.demo.domains.UniversityDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by dsm2061 on 7/30/18.
 */

@Service
public class UniversityService {


    RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<UniversityDetails[]> getDetails(){
        ResponseEntity<UniversityDetails[]> forEntity = restTemplate.getForEntity("http://universities.hipolabs.com/search?name=middle", UniversityDetails[].class);
        return forEntity;
    }
}
