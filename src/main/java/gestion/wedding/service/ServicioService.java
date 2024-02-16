package gestion.wedding.service;

import java.util.List;
import gestion.wedding.model.ServicioDTO;


public interface ServicioService {

	void agregarServicio(ServicioDTO servicioDTO);
	
	List<ServicioDTO> mostrarTodosLosServicios();
}
