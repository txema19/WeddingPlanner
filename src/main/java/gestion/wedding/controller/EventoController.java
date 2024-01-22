package gestion.wedding.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import gestion.wedding.model.EventoDTO;
import gestion.wedding.service.EventoService;

@RestController
@RequestMapping("/eventos")
public class EventoController {

	@Autowired
	EventoService eventoService;

	@PostMapping
	ResponseEntity<?> agregarEvento(@RequestBody EventoDTO eventoDTO) {

		EventoDTO evento = eventoService.crearEvento(eventoDTO);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/" + evento.getId_evento())
				.buildAndExpand(evento.getId_evento()).toUri();

		return ResponseEntity.created(location).build();

	}

}
