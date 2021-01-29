package com.reto.demo.Reto.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reto.demo.Reto.entities.Cliente;
import com.reto.demo.Reto.model.ClienteModelo;
import com.reto.demo.Reto.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	@Override
	public Cliente agregarCliente(Cliente obj) {
		
		
		return repository.saveAndFlush(obj);
	}


	@Override
	public List<ClienteModelo> listaCliente() {
		List<ClienteModelo> listadoCliente=new ArrayList<>();
		
	
		
		for(Cliente e : repository.findAll()) {
			listadoCliente.add(new ClienteModelo(e.getId(),e.getNombre(),e.getApellido(),2,e.getFechaNacimiento() ));
		}
						
				
		return listadoCliente;
	}



}
