package com.ista.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ista.model.Carta;

public interface CartaRepository extends MongoRepository<Carta, Long>{

}
