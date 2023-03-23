package com.ista.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.Repository.CartaRepository;
import com.ista.model.Carta;

@Service
public class CartaServiceImpl extends GenericServicelmpl<Carta, Long> implements CartaService {

	
	@Autowired
	CartaRepository cartaRepository;
	@Override
	public CrudRepository<Carta, Long> getDao() {
		// TODO Auto-generated method stub
		return cartaRepository;
	}

}
