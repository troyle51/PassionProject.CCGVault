package com.passionproject.ccgvault.services;

import com.passionproject.ccgvault.models.DigimonCard;
import com.passionproject.ccgvault.repositories.DigimonCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DigimonCardService {
    //This is where Calc, data transformation, data processes, and cross-record validation (business rules) are done
    @Autowired
    private DigimonCardRepository repository;
    public DigimonCardService(DigimonCardRepository repository) { this.repository = repository; }
    public List<DigimonCard> listAll() {
        return (List<DigimonCard>) repository.findAll();
    }

    public void save(DigimonCard card) {
        repository.save(card);
    }

    public DigimonCard get(Integer id) {
        return repository.findById(Long.valueOf(id)).get();
    }

    public void delete(Integer id) {
        repository.deleteById(Long.valueOf(id));
    }

}