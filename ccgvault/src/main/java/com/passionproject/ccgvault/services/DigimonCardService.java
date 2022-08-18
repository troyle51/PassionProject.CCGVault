package com.passionproject.ccgvault.services;

import com.passionproject.ccgvault.models.DigimonCard;
import com.passionproject.ccgvault.repositories.DigimonCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DigimonCardService {
    //This is where Calc, data transformation, data processes, and cross-record validation (business rules) are done
    @Autowired
    private DigimonCardRepository repository;
    private RestTemplate template = new RestTemplate();
    public DigimonCardService(DigimonCardRepository repository) { this.repository = repository; }

    public DigimonCardService() {

    }

    public Object[] listAll() {
        return template.getForObject("https://digimoncard.io/api-public/getAllCards.php?sort=name&series=Digimon Card Game&sortdirection=asc", Object[].class);
    }

    public void save(DigimonCard card) {
        repository.save(card);
    }

    public String getByName(String name) {
        return template.getForObject(("https://digimoncard.io/api-public/search.php?n=" + name), String.class);
    }
    public String getByCardNumber(String card) {
        return template.getForObject(("https://digimoncard.io/api-public/search.php?card=" + card), String.class);
    }

    public void delete(Integer id) {
        repository.deleteById(Long.valueOf(id));
    }

}