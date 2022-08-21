package com.passionproject.ccgvault.repositories;

import com.passionproject.ccgvault.models.DigimonCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface GenericRepository extends JpaRepository<DigimonCard, Long> {
    List<DigimonCard> findByName(String name);

}
