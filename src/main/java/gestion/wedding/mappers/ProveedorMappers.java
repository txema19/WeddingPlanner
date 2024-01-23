package gestion.wedding.mappers;


import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import gestion.wedding.model.ProveedorDTO;
import gestion.wedding.model.ServicioDTO;
import gestion.wedding.persistence.entities.ProveedorEntity;
import gestion.wedding.persistence.entities.ServicioEntity;



@Mapper(componentModel = "spring", uses = {ServicioMappers.class})
public interface ProveedorMappers {
	
	
    ProveedorDTO toDto(ProveedorEntity proveedor);
    
    List<ProveedorDTO> listaToDTO(List<ProveedorEntity> listaEntity);
	
    
    ProveedorEntity toEntity(ProveedorDTO proveedorDTO);
    
    
    
    
	
}
