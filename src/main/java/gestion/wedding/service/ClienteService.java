package gestion.wedding.service;

import java.util.List;
import org.springframework.stereotype.Service;
import gestion.wedding.model.ClienteDTO;

@Service
public interface ClienteService {

	ClienteDTO agregarCliente(ClienteDTO clienteDTO);

	Integer buscarClientePorEmail(String email);

	List<ClienteDTO> mostrarTodosLoscliente();
	
	ClienteDTO buscarClientePorId(Integer clienteId);
}
