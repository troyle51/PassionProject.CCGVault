package com.passionproject.ccgvault.repositories;

import com.passionproject.ccgvault.models.DigimonCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DigimonCardRepository extends CrudRepository<DigimonCard, Long> {
    //This is where data is CRUD to database

    @Override
    <S extends DigimonCard> S save(S entity);

    @Override
    <S extends DigimonCard> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    Optional<DigimonCard> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    Iterable<DigimonCard> findAll();

    @Override
    Iterable<DigimonCard> findAllById(Iterable<Long> longs);

    @Override
    long count();

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(DigimonCard entity);

    @Override
    void deleteAllById(Iterable<? extends Long> longs);

    @Override
    void deleteAll(Iterable<? extends DigimonCard> entities);

    @Override
    void deleteAll();
}
