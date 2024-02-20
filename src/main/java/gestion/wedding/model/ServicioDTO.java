package gestion.wedding.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServicioDTO {
	
	private Integer id_servicio;
	private String nombre;
	private Double precio;
	private Integer idProveedor; //tiene el id de provee
	
	

}
