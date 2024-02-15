package gestion.wedding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gestion.wedding.model.ClienteDTO;
import gestion.wedding.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteControler {

	@Autowired
	ClienteService clienteService;
	
	@GetMapping
	ResponseEntity<?> mostrarTodosLosCliente(){
		
		List<ClienteDTO> listaCliente = clienteService.mostrarTodosLoscliente();
		
		return ResponseEntity.ok(listaCliente);
	}
	
	
	@GetMapping("/{clienteId}")
	ResponseEntity<?> buscarClientePorId(@PathVariable Integer clienteId){
		ClienteDTO clienteDTO = clienteService.buscarClientePorId(clienteId);
		
		return ResponseEntity.ok(clienteDTO);
	}
}
