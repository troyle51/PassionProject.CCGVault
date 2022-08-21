package com.passionproject.ccgvault.services;


import com.passionproject.ccgvault.models.DigimonCard;
import com.passionproject.ccgvault.repositories.DigimonCardRepository;
import com.passionproject.ccgvault.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericService {
    //This is where Calc, data transformation, data processes, and cross-record validation (business rules) are done
    @Autowired
    private GenericRepository repository;
    public GenericService(GenericRepository repository) { this.repository = repository; }

    public GenericService() {

    }



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