package gestion.wedding.persistence.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProveedorEntity {

	@Id
	private int idProveedor;
	private String nombre;
	private String dirreccion;
	private String tln;
	

}
