package gestion.wedding.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import gestion.wedding.model.ServicioDTO;
import gestion.wedding.persistence.entities.ServicioEntity;

@Mapper(componentModel = "spring")
public interface ServicioMappers {
	
//	@Mapping(source="proveedor", target="id_proveedor",qualifiedByName = "mapProveedorid")
//	ServicioDTO mapToServicioEntity(ServicioEntity servicioEntity);
//	
//	ServicioEntity mapToServicioDTO(ServicioDTO servicioDTO);
//	
//	@Named("mapProveedorid")
//	default Integer mapProveedorid(ProveedorEntity proveedorEntity) {
//		if (proveedorEntity != null) {
//			return proveedorEntity.getIdProveedor();
//		}
//		return null;
//	}
}
