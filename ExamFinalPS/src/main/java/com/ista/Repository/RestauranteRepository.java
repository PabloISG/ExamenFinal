package com.ista.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ista.model.Restaurante;

public interface RestauranteRepository extends MongoRepository<Restaurante, Long>{

}
