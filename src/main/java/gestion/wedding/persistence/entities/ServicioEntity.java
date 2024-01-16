package gestion.wedding.persistence.entities;

import gestion.wedding.model.ServicioDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ServicioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id_servicio;
	private String nombre;
	private Double precio;
	private Integer id_curso;

	@ManyToOne 
	@JoinColumn(name = "id_proveedor")
	private ProveedorEntity proveedor;
}
