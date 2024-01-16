package gestion.wedding.service;

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

}
