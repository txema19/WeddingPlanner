package gestion.wedding.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestion.wedding.mappers.ClienteMappers;
import gestion.wedding.model.ClienteDTO;
import gestion.wedding.persistence.entities.ClienteEntity;
import gestion.wedding.persistence.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	ClienteMappers clienteMappers;

	@Override
	public ClienteDTO agregarCliente(ClienteDTO clienteDTO) {

		ClienteEntity clienteEntity = clienteRepository.save(clienteMappers.mapToClienteEntity(clienteDTO));

		return clienteMappers.mapToClienteDTO(clienteEntity);
	}

	@Override
	public Integer buscarClientePorEmail(String email) {
		System.out.println(email);
		ClienteEntity clienteEntity = clienteRepository.findByEmail(email);
		if (clienteEntity != null) {
			return clienteEntity.getCod_cliente();
		} else {
			return null;
		}
	}

	@Override
	public List<ClienteDTO> mostrarTodosLoscliente() {

		List<ClienteEntity> listaClientes = clienteRepository.findAll();

		List<ClienteDTO> listaClientesDTO = clienteMappers.listaToDTO(listaClientes);

		return listaClientesDTO;
	}

	@Override
	public ClienteDTO buscarClientePorId(Integer clienteId) {
		
		Optional<ClienteEntity> clienteEntity = clienteRepository.findById(clienteId);
		
		if(clienteEntity.isPresent()) {
			return clienteMappers.mapToClienteDTO(clienteEntity.get());
		}
		
		return null;
	}

}
