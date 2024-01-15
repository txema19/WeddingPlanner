package gestion.wedding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.wedding.mappers.ServicioMappers;
import gestion.wedding.model.ServicioDTO;
import gestion.wedding.persistence.entities.ServicioEntity;
import gestion.wedding.persistence.repositories.ServicioRepository;

@Service
public class ServicioServiceImpl implements ServicioService{

	@Autowired
	ServicioRepository servicioRepository;
	
	@Autowired
	ServicioMappers servicioMappers;
	
	
	@Override
	public void agregarServico(ServicioDTO servicioDTO) {
		
		//ServicioEntity servicioEntity = servicioRepository.save(servicioMappers.mapToServicioEntity(servicioDTO));
		
	
	}

	@Override
	public List<ServicioDTO> mostrarTodosLosServicios() {
		// TODO Auto-generated method stub
		return null;
	}

}
