package gestion.wedding.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
		
		ServicioDTO servicio = servicioService.agregarServicio(ServicioDTO);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/"+servicio.getNombre()).buildAndExpand(servicio.getNombre())
				.toUri();
		
		return ResponseEntity.created(location).build();
		
	}

}
