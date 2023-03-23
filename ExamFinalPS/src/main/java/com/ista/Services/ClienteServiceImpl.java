package com.ista.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.Repository.ClienteRepository;
import com.ista.model.Cliente;


@Service
public class ClienteServiceImpl extends GenericServicelmpl<Cliente, Long> implements ClienteService{

	@Autowired
	ClienteRepository clienteRepository;
	@Override
	public CrudRepository<Cliente, Long> getDao() {
		// TODO Auto-generated method stub
		return clienteRepository;
	}

}
