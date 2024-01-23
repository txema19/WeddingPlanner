package gestion.wedding.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import gestion.wedding.model.FacturaDTO;
import gestion.wedding.service.FacturaService;

@RestController
@RequestMapping("/factura")
public class FacturaController {

	@Autowired
	FacturaService facturaService;
	
	@PostMapping
	ResponseEntity<?> GenerarFactura(@RequestBody FacturaDTO facturaDTO){
		
		FacturaDTO factura = facturaService.GenerarFactura(facturaDTO);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/"+factura.getId_factura()).buildAndExpand(factura.getId_factura())
				.toUri();
		
		return ResponseEntity.created(location).build();
		
	}
}
