package com.passionproject.ccgvault.repositories;

import com.passionproject.ccgvault.models.DigimonCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigimonCardRepository extends CrudRepository<DigimonCard, Long> {
    //This is where data is CRUD to database

}
