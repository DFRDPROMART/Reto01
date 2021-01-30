package  com.reto.demo.Reto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reto.demo.Reto.entities.Cliente;
import com.reto.demo.Reto.model.ClienteModelo;
import com.reto.demo.Reto.services.ClienteService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Cliente", description = "API métodos del cliente")
@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService servicio;
	
	@ApiOperation(value = "/creacliente", notes = "Registrar un cliente")
	@PostMapping("/creacliente")
	public Cliente registrarCliente(@RequestBody Cliente obj) {
						
		return servicio.agregarCliente(obj);
	}
	
	
	@ApiOperation(value = "/listclientes", notes = "Datos del cliente")
	@GetMapping("/listclientes")
	public List<ClienteModelo> listadoCliente(){
		
		return servicio.listaCliente();
	}

}
