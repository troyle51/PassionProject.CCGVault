package com.passionproject.ccgvault.services;

import com.passionproject.ccgvault.models.DigimonCard;
import com.passionproject.ccgvault.repositories.DigimonCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DigimonCardService {
    //This is where Calc, data transformation, data processes, and cross-record validation (business rules) are done
    @Autowired
    private DigimonCardRepository repository;
    public DigimonCardService(DigimonCardRepository repository) { this.repository = repository; }
    public Iterable<DigimonCard> index() {
        return repository.findAll();
    }

    public DigimonCard show(Long id) {
        return repository.findById(id).get();
    }

}