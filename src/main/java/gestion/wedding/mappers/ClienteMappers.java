package gestion.wedding.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import gestion.wedding.model.ClienteDTO;
import gestion.wedding.persistence.entities.ClienteEntity;

@Mapper(componentModel = "spring")
public interface ClienteMappers {

	ClienteDTO mapToClienteDTO(ClienteEntity clienteEntity);

	ClienteEntity mapToClienteEntity(ClienteDTO clienteDTO);
	
	List<ClienteDTO> listaToDTO(List<ClienteEntity> listaEntity);
	
}
