package gestion.wedding.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import gestion.wedding.model.ProveedorDTO;
import gestion.wedding.persistence.entities.ProveedorEntity;



@Mapper(componentModel = "spring", uses = {ServicioMappers.class})
public interface ProveedorMappers {
	
	@Mapping(target = "servicio", ignore = true)
    ProveedorDTO toDto(ProveedorEntity proveedor);
    ProveedorEntity toEntity(ProveedorDTO proveedorDTO);
    
    @Mapping(target = "servicio", ignore = true)
    ProveedorDTO toDtoWithoutStudents(ProveedorEntity curso);
	
}
