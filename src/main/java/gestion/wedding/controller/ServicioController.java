package gestion.wedding.controller;

import java.net.URI;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import gestion.wedding.model.ServicioDTO;
import gestion.wedding.service.ServicioService;

@RestController
@RequestMapping("/servicios")
public class ServicioController {
	
	@Autowired
	ServicioService servicioService;
	
	@PostMapping
	ResponseEntity<?> agregarServicio(@RequestBody ServicioDTO ServicioDTO){
		
		servicioService.agregarServicio(ServicioDTO);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/"+ServicioDTO.getId_servicio()).buildAndExpand(ServicioDTO.getNombre())
				.toUri();
		
		return ResponseEntity.created(location).build();
		
	}
	
	@GetMapping
	ResponseEntity<?> mostrarTodosLosServicios(){
		List<ServicioDTO> listaServicios = servicioService.mostrarTodosLosServicios();
		
		return ResponseEntity.ok(listaServicios);
	}
	

}
