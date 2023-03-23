package com.ista.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ista.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, Long>{

}
