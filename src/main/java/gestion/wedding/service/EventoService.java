package gestion.wedding.service;

import gestion.wedding.model.EventoDTO;

public interface EventoService {
	
	EventoDTO crearEvento(EventoDTO eventoDTO);
	
	//Integer buscarEventoPorCodCliente(Integer codCliente);

}
