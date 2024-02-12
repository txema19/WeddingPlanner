package gestion.wedding.persistence.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

	@ManyToOne 
	@JoinColumn(name = "id_proveedor")
	private ProveedorEntity proveedor;
	
	@ManyToMany(mappedBy = "servicios")
    private List<EventoEntity> eventos;
}
