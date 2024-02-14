package gestion.wedding.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import gestion.wedding.model.FacturaDTO;
import gestion.wedding.persistence.entities.EventoEntity;
import gestion.wedding.persistence.entities.FacturaEntity;


@Mapper(componentModel = "spring")
public interface FacturaMappers {

    @Mapping(source = "evento", target = "id_evento", qualifiedByName = "mapFacturaid")
    FacturaDTO toDTO(FacturaEntity facturaEntity);
    
    FacturaEntity toEntity(FacturaDTO facturaDTO);
    
    @Named("mapFacturaid")
    default Integer mapFacturaid(EventoEntity eventoEntity) {
        if (eventoEntity != null) {
            return eventoEntity.getId_evento();
        }
        return null;
    }
	
    
	}

