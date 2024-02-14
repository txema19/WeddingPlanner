package gestion.wedding.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gestion.wedding.mappers.EventoMappers;
import gestion.wedding.model.EventoDTO;
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

//	@Override
//	public Integer buscarEventoPorCodCliente(Integer codCliente) {
//	    // Realiza la consulta en el repositorio de eventos para encontrar un evento con el código de cliente dado
//	    EventoEntity eventoEntity = eventoRepository.findByClienteCod_Cliente(codCliente);
//	    if (eventoEntity != null) {
//	        return eventoEntity.getId_evento();
//	    } else {
//	        return null; // O maneja el caso de evento no encontrado de alguna otra manera
//	    }
//	}

}
