package gestion.wedding.persistence.entities;


import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProveedorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id_proveedor;
	private String nombre;
	private String dirreccion;
	private String tln;
	
	@OneToMany(mappedBy = "proveedor")
    private List<ServicioEntity> servicio;
	

}
