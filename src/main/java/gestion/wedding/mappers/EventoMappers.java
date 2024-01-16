package gestion.wedding.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import gestion.wedding.model.EventoDTO;
import gestion.wedding.persistence.entities.EventoEntity;

@Mapper(componentModel = "spring")
public interface EventoMappers {

	EventoDTO mapToEventoDTO(EventoEntity eventoEntity);
	
	EventoEntity mapToEventoEntity(EventoDTO eventoDTO);
	
	
	List<EventoDTO> listaToDTO(List<EventoEntity> listaEntity);
	
	List<EventoEntity> listaToEntity(List<EventoDTO> listaDTO);
}
