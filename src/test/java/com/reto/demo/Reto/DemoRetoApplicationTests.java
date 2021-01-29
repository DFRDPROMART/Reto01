package com.reto.demo.Reto;

import com.reto.demo.Reto.entities.Cliente;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoRetoApplicationTests {


	@Test
	void testClient() {

		Cliente cliente=new Cliente ();
		cliente.setApellido("Apellido");
		cliente.setNombre("nombre");

		Long id= Long.parseLong("1");

		cliente.setId(id);

		Assertions.assertEquals("Apellido", cliente.getApellido());
		
		
	}

}
