package com.ista.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.Repository.RestauranteRepository;
import com.ista.model.Restaurante;

@Service
public class RestauranteServiceImpl extends GenericServicelmpl<Restaurante, Long> implements RestauranteService{

	
	@Autowired
	RestauranteRepository restauranteRepository;
	@Override
	public CrudRepository<Restaurante, Long> getDao() {
		// TODO Auto-generated method stub
		return restauranteRepository;
	}

}
