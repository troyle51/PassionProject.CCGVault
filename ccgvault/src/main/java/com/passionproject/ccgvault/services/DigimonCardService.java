package com.passionproject.ccgvault.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.passionproject.ccgvault.models.DigimonCard;
import com.passionproject.ccgvault.repositories.DigimonCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.InputStream;
import java.util.List;

@Service
public class DigimonCardService {
    @Autowired
    private DigimonCardRepository repository;
    private RestTemplate template = new RestTemplate();
    public DigimonCardService(DigimonCardRepository repository) { this.repository = repository; }

    public DigimonCardService() {

    }

    public List<DigimonCard> listAll() throws JsonProcessingException {
        String url = "https://digimoncard.io/api-public/search.php?n=";
        HttpEntity<String> entity = new HttpEntity<>(new HttpHeaders());
        ResponseEntity<String> response = template.exchange(url, HttpMethod.GET, entity, String.class);
        String jsonDigimon = response.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        List<DigimonCard> listDigimon = objectMapper.readValue(jsonDigimon, new TypeReference<List<DigimonCard>>(){});
        saveAll(listDigimon);

        return listDigimon;
    }


    public void saveAll(Iterable<DigimonCard> card) {
        repository.saveAll(card);
    }
    public void save(DigimonCard card) {
        repository.save(card);
    }

    public List<DigimonCard> getByName(String name) throws JsonProcessingException {
        String url = ("https://digimoncard.io/api-public/search.php?n=" + name);
        HttpEntity<String> entity = new HttpEntity<>(new HttpHeaders());
        ResponseEntity<String> response = template.exchange(url, HttpMethod.GET, entity, String.class);
        String jsonDigimon = response.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        List<DigimonCard> digimon = objectMapper.readValue(jsonDigimon, new TypeReference<List<DigimonCard>>(){});
        saveAll(digimon);

        return digimon;
    }
    public List<DigimonCard> getByCardNumber(String card) throws JsonProcessingException {
        String url = ("https://digimoncard.io/api-public/search.php?card=" + card);
        HttpEntity<String> entity = new HttpEntity<>(new HttpHeaders());
        ResponseEntity<String> response = template.exchange(url, HttpMethod.GET, entity, String.class);
        String jsonDigimon = response.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        List<DigimonCard> digimon = objectMapper.readValue(jsonDigimon, new TypeReference<List<DigimonCard>>(){});
        saveAll(digimon);
        return digimon;
    }

    public void delete(Integer id) {
        repository.deleteById(Long.valueOf(id));
    }

}