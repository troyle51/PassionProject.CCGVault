package com.passionproject.ccgvault.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.passionproject.ccgvault.models.DigimonCard;
import com.passionproject.ccgvault.services.DigimonCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@RestController
public class DigimonCardController {
    //Keep layer thin as possible. Limit this class to receiving, validating inputs, manipulating object models and returning
    // the moved and View object. All business-related operations should be done in service class.
    @Autowired
    private DigimonCardService service;
    private RestTemplate template = new RestTemplate();

    // RESTful API methods for Retrieval operations
    @GetMapping(value = "/all")
    private List<DigimonCard> getApiCall() throws JsonProcessingException {
        return service.listAll();
    }
    @GetMapping(value = "card")
    public @ResponseBody List<DigimonCard>  getCardByName(@RequestParam String name) throws IOException {
        return service.getByName(name);
    }
    @GetMapping(value = "cardNum")
    public @ResponseBody List<DigimonCard> getCardByNumber(@RequestParam String card) throws IOException {
        return service.getByCardNumber(card);
    }



//    @GetMapping("/products/{id}")
//    public ResponseEntity<DigimonCard> get(@PathVariable Integer id) {
//        try {
//            DigimonCard product = service.get(id);
//            return new ResponseEntity<DigimonCard>(product, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<DigimonCard>(HttpStatus.NOT_FOUND);
//        }
//    }
    // RESTful API method for Create operation
//    @PostMapping("/products")
//    public void add(@RequestBody DigimonCard product) {
//        service.save(product);
//    }

    // RESTful API method for Update operation
//    @PutMapping("/products/{id}")
//    public ResponseEntity<?> update(@RequestBody DigimonCard product, @PathVariable Integer id) {
//        try {
//            DigimonCard existProduct = service.get(id);
//            service.save(product);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

    // RESTful API method for Delete operation
    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
