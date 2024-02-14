package gestion.wedding.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import gestion.wedding.model.EventoDTO;
import gestion.wedding.persistence.entities.ClienteEntity;
import gestion.wedding.persistence.entities.EventoEntity;

@Mapper(componentModel = "spring")
public interface EventoMappers {

	@Mapping(source="cliente", target="cod_cliente",qualifiedByName = "mapClienteid")
	EventoDTO mapToEventoDTO(EventoEntity eventoEntity);
	
	EventoEntity mapToEventoEntity(EventoDTO eventoDTO);
	
	
	List<EventoDTO> listaToDTO(List<EventoEntity> listaEntity);
	
	List<EventoEntity> listaToEntity(List<EventoDTO> listaDTO);
	
	@Named("mapClienteid")
	default Integer mapClienteid(ClienteEntity clienteEntity) {
		if (clienteEntity != null) {
			return clienteEntity.getCod_cliente();
		}
		return null;
	}
	
}
