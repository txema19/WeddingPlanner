package gestion.wedding.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gestion.wedding.mappers.EventoMappers;
import gestion.wedding.model.EventoDTO;
import gestion.wedding.model.ServicioDTO;
import gestion.wedding.persistence.entities.EventoEntity;
import gestion.wedding.persistence.repositories.EventoRepository;

@Service
public class EventoServiceImpl implements EventoService {

	@Autowired
	EventoRepository eventoRepository;

	@Autowired
	EventoMappers eventoMappers;

	@Override
	public EventoDTO crearEvento(EventoDTO eventoDTO) {

		EventoEntity eventoEntity = eventoMappers.mapToEventoEntity(eventoDTO);
		eventoRepository.save(eventoEntity);

		return eventoMappers.mapToEventoDTO(eventoEntity);

		
	}

}
