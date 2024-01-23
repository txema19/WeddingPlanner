package gestion.wedding.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import gestion.wedding.model.FacturaDTO;
import gestion.wedding.persistence.entities.FacturaEntity;



@Mapper(componentModel = "spring")
public interface FacturaMappers {

	FacturaDTO toDto(FacturaEntity factura);
    
    FacturaEntity toEntity(FacturaDTO facturaDTO);
}
