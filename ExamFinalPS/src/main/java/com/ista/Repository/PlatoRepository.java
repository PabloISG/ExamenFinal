package com.ista.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ista.model.Plato;

public interface PlatoRepository extends MongoRepository<Plato, Long>{

}
