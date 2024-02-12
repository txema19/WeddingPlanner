package gestion.wedding.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import gestion.wedding.persistence.entities.EventoEntity;


public interface EventoRepository extends JpaRepository<EventoEntity,Integer>{
	
	EventoEntity findByCodCliente(Integer codCliente);

}
