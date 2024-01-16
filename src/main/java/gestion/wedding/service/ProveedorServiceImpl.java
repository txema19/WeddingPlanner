package gestion.wedding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.wedding.mappers.ProveedorMappers;
import gestion.wedding.model.ProveedorDTO;
import gestion.wedding.persistence.entities.ProveedorEntity;
import gestion.wedding.persistence.repositories.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService{
	
	@Autowired
	ProveedorRepository proveedorRepository;
	
	@Autowired
	ProveedorMappers proveedorMappers;

	@Override
	public ProveedorDTO agregarProveedor(ProveedorDTO proveedorDTO) {
		
		ProveedorEntity proveedorEntity = proveedorRepository.save(proveedorMappers.toEntity(proveedorDTO));
		
		return proveedorMappers.toDto(proveedorEntity);
	}

}
