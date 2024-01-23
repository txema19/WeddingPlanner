package gestion.wedding.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gestion.wedding.persistence.entities.FacturaEntity;

public interface FacturaRepository extends JpaRepository<FacturaEntity,Integer>{

}
