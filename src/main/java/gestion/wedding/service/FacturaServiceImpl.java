package gestion.wedding.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.wedding.mappers.FacturaMappers;
import gestion.wedding.model.FacturaDTO;
import gestion.wedding.persistence.entities.EventoEntity;
import gestion.wedding.persistence.entities.FacturaEntity;
import gestion.wedding.persistence.entities.ProveedorEntity;
import gestion.wedding.persistence.entities.ServicioEntity;
import gestion.wedding.persistence.repositories.EventoRepository;
import gestion.wedding.persistence.repositories.FacturaRepository;
import gestion.wedding.persistence.entities.EventoEntity;

@Service
public class FacturaServiceImpl implements FacturaService{
	@Autowired
	FacturaMappers facturamapper;
	
	@Autowired
	FacturaRepository facturarepository;
	
	@Autowired
	EventoRepository eventorepository;

	@Override
	public FacturaDTO GenerarFactura(FacturaDTO facturaDTO) {
		
		Integer EventoId = facturaDTO.getId_evento();
		
		Optional<EventoEntity> evento = eventorepository.findById(EventoId);

		if(evento.isPresent()) {
			FacturaEntity facturaEntity = facturamapper.toEntity(facturaDTO);
			facturaEntity.setEvento(evento.get());
			facturarepository.save(facturaEntity);

			return facturamapper.toDTO(facturaEntity);
		}
		return null;

	}

}
