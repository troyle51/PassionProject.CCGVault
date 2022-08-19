package com.passionproject.ccgvault;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.passionproject.ccgvault.models.DigimonCard;
import com.passionproject.ccgvault.services.DigimonCardService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.InputStream;
import java.util.List;


@SpringBootApplication
public class CcgvaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcgvaultApplication.class, args);
	}


}
