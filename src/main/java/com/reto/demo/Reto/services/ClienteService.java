package com.reto.demo.Reto.services;

import java.util.List;

import com.reto.demo.Reto.entities.Cliente;
import com.reto.demo.Reto.model.ClienteModelo;


public interface ClienteService {
	
	public Cliente agregarCliente(Cliente obj);
	

	
	public List<ClienteModelo> listaCliente();
	
	
}
