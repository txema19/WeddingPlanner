package gestion.wedding.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import gestion.wedding.model.ServicioDTO;
import gestion.wedding.persistence.entities.ProveedorEntity;
import gestion.wedding.persistence.entities.ServicioEntity;

@Mapper(componentModel = "spring")
public interface ServicioMappers {
	
	@Mapping(source="proveedor", target="idProveedor",qualifiedByName = "mapProveedorid")
	ServicioDTO mapToServicioDTO(ServicioEntity servicioEntity);
	
	ServicioEntity mapToServicioEntity(ServicioDTO servicioDTO);
	
	List<ServicioDTO> listaToDTO(List<ServicioEntity> listaEntity);
	
	@Named("mapProveedorid")
	default Integer mapProveedorid(ProveedorEntity proveedorEntity) {
		if (proveedorEntity != null) {
			return proveedorEntity.getId_proveedor();
		}
		return null;
	}
}
