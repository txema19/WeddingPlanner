package gestion.wedding.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import gestion.wedding.model.ProveedorDTO;
import gestion.wedding.service.ProveedorService;


@RestController
@RequestMapping("/proveedor")
public class ProveedorController {
	
	@Autowired
	ProveedorService proveedorService;
	
	@PostMapping
	ResponseEntity<?> agregarProveedor(@RequestBody ProveedorDTO proveedorDTO){
		
		ProveedorDTO proveedor = proveedorService.agregarProveedor(proveedorDTO);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/"+proveedor.getNombre()).buildAndExpand(proveedor.getNombre())
				.toUri();
		
		return ResponseEntity.created(location).build();
		
	}

}
