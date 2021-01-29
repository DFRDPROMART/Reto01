package com.reto.demo.Reto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reto.demo.Reto.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	

}
