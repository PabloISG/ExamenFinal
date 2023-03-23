package com.ista.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.Repository.PlatoRepository;
import com.ista.model.Plato;

@Service
public class PlatoServiceImpl extends GenericServicelmpl<Plato, Long> implements PlatoService{

	
	@Autowired
	PlatoRepository platoRepository;
	@Override
	public CrudRepository<Plato, Long> getDao() {
		// TODO Auto-generated method stub
		return platoRepository;
	}

}
