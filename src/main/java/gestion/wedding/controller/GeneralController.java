package gestion.wedding.controller;

import java.time.LocalDate;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gestion.wedding.model.ClienteDTO;
import gestion.wedding.model.EventoDTO;
import gestion.wedding.model.FacturaDTO;
import gestion.wedding.model.GeneralDTO;
import gestion.wedding.service.ClienteService;
import gestion.wedding.service.EventoService;
import gestion.wedding.service.FacturaService;

@RestController
@RequestMapping("/general")
public class GeneralController {

	@Autowired
	EventoService eventoService;

	@Autowired
	ClienteService clienteService;

	@Autowired
	FacturaService facturaService;

	@PostMapping
	ResponseEntity<?> crearEvento(@RequestBody GeneralDTO generalDTO) {

		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setNombre(generalDTO.getNombreCliente());
		clienteDTO.setEmail(generalDTO.getEmail());
		clienteDTO.setDir(generalDTO.getDireccion());
		clienteDTO.setTlf(generalDTO.getTelefono());

		ClienteDTO cliente = clienteService.agregarCliente(clienteDTO);

		

		EventoDTO eventoDTO = new EventoDTO();
		eventoDTO.setNum_invitados(generalDTO.getNumeroInvitados());
		eventoDTO.setFecha(generalDTO.getFechaEvento());
		eventoDTO.setCod_cliente(cliente.getCod_cliente());
		eventoDTO.setServicios(generalDTO.getListaServicios());
		eventoDTO.setPrecio(generalDTO.getPrecioTotal());

		EventoDTO evento = eventoService.crearEvento(eventoDTO);

		

		FacturaDTO facturaDTO = new FacturaDTO();

		facturaDTO.setTarjeta(generalDTO.getTarjeta());
		facturaDTO.setPrecio_final(generalDTO.getPrecioFactura());
		facturaDTO.setId_evento(evento.getId_evento());
		facturaDTO.setFecha(LocalDate.now());
		;

		facturaService.GenerarFactura(facturaDTO);

		return ResponseEntity.ok("Evento creado exitosamente");

	}

}
