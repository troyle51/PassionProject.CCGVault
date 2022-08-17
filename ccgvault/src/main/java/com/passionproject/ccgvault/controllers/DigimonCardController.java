package com.passionproject.ccgvault.controllers;

import com.passionproject.ccgvault.models.DigimonCard;
import com.passionproject.ccgvault.services.DigimonCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Controller
public class DigimonCardController {
    //Keep layer thin as possible. Limit this class to receiving, validating inputs, manipulating object models and returning
    // the moved and View object. All business-related operations should be done in service class.
    @Autowired
    private DigimonCardService service;

    //https://digimoncard.io/api-public/search.php?n=Agumon&desc=Reveal 5 cards&color=red&type=digimon&attribute=Vaccine&card=BT1-010&pack=BT01-03: Release Special Booster Ver.1.0&sort=name&sortdirection=desc&series=Digimon Card Game
    @GetMapping(value = "card")
    public @ResponseBody String getCardByName(@RequestParam String n) throws IOException {
        URL apiUrl = new URL("https://digimoncard.io/api-public/search.php?n=" + n);
        HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null){
            content.append(inputLine);
        }
        in.close();
        return content.toString();
    }

    @GetMapping(value = "cardNum")
    public @ResponseBody String getCardByNumber(@RequestParam String card) throws IOException {
        URL apiUrl = new URL("https://digimoncard.io/api-public/search.php?card=" + card);
        HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null){
            content.append(inputLine);
        }
        in.close();
        return content.toString();
    }

    @GetMapping(value = ("/digimon-all"))
    public @ResponseBody String getAllCards() throws IOException {
        URL apiUrl = new URL("https://digimoncard.io/api-public/getAllCards.php?sort=name&series=Digimon Card Game&sortdirection=asc");
        HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null){
            content.append(inputLine);
        }
        in.close();
        return content.toString();
    }

}
