package com.passionproject.ccgvault.controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.passionproject.ccgvault.models.DigimonCard;
import com.passionproject.ccgvault.repositories.GenericRepository;
import com.passionproject.ccgvault.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@RestController
public class dbController {
    @Autowired
    private GenericRepository repo;

    private RestTemplate template = new RestTemplate();


    @GetMapping("/card/name")
    public ResponseEntity<List<DigimonCard>> getCardByName(@RequestParam String name) {
        return new ResponseEntity<List<DigimonCard>>(repo.findByName(name), HttpStatus.OK);
    }

}
