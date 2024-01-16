package gestion.wedding.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProveedorDTO {
	
		
			
	private int id_proveedor;
	private String nombre;
	private String dirreccion;
	private String tln;
	
	private List<ServicioDTO> servicio;

	
}
