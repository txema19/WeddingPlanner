package gestion.wedding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import gestion.wedding.exceptions.ProveedorNotFoundExcepcion;
import gestion.wedding.mappers.ServicioMappers;
import gestion.wedding.model.ProveedorDTO;
import gestion.wedding.model.ServicioDTO;
import gestion.wedding.persistence.entities.ProveedorEntity;
import gestion.wedding.persistence.entities.ServicioEntity;
import gestion.wedding.persistence.repositories.ProveedorRepository;
import gestion.wedding.persistence.repositories.ServicioRepository;

@Service
public class ServicioServiceImpl implements ServicioService {

	@Autowired
	ServicioRepository servicioRepository;

	@Autowired
	ServicioMappers servicioMappers;

	@Autowired
	ProveedorRepository proveedorRepository;

	@Autowired
	ProveedorService proveedorService;

	@Override
	public void agregarServicio(ServicioDTO servicioDTO) {
		if (proveedorService.getProveedorPorId(servicioDTO.getIdProveedor()) != null) {

			Integer proveedorId = servicioDTO.getIdProveedor();

			Optional<ProveedorEntity> proveedor = proveedorRepository.findById(proveedorId);

			if (proveedor.isPresent()) {
				ServicioEntity servicioEntity = servicioMappers.mapToServicioEntity(servicioDTO);
				servicioEntity.setProveedor(proveedor.get());
				servicioRepository.save(servicioEntity);

				//return servicioMappers.mapToServicioDTO(servicioEntity);

			}

		} else {
			throw new ProveedorNotFoundExcepcion("No existe ese proovedor, debes crearlo antes de crear el servicio.");
		}

		//return null; // habra que hacer una excepcion

	}

	@Override
	public List<ServicioDTO> mostrarTodosLosServicios() {

		List<ServicioEntity> listaServicos = servicioRepository.findAll();

		List<ServicioDTO> listaServicossDTO = servicioMappers.listaToDTO(listaServicos);

		return listaServicossDTO;
	}

}
