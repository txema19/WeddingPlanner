package gestion.wedding.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestion.wedding.persistence.entities.ServicioEntity;

@Repository
public interface ServicioRepository extends JpaRepository<ServicioEntity,Integer>{

}
