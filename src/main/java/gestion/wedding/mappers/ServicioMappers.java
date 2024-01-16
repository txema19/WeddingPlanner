package gestion.wedding.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import gestion.wedding.model.ServicioDTO;
import gestion.wedding.persistence.entities.EventoEntity;
import gestion.wedding.persistence.entities.ProveedorEntity;
import gestion.wedding.persistence.entities.ServicioEntity;

@Mapper(componentModel = "spring")
public interface ServicioMappers {
	
	@Mapping(source="proveedor", target="idProveedor",qualifiedByName = "mapProveedorid")
	//@Mapping(source="evento", target="id_evento",qualifiedByName = "mapEventoid")
	ServicioDTO mapToServicioDTO(ServicioEntity servicioEntity);
	
	
	
	ServicioEntity mapToServicioEntity(ServicioDTO servicioDTO);
	
	List<ServicioDTO> listaToDTO(List<ServicioEntity> listaEntity);
	
	@Named("mapProveedorid")
	default Integer mapProveedorid(ProveedorEntity proveedorEntity) {
		if (proveedorEntity != null) {
			return proveedorEntity.getIdProveedor();
		}
		return null;
	}
	
//	@Named("mapEventoid")
//	default Integer mapEventoid(EventoEntity eventoEntity) {
//	    if (eventoEntity != null) {
//	        return eventoEntity.getId_evento();
//	    } else {
//	        return null;
//	    }
//	}
}
