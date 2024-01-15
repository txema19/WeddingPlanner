package gestion.wedding.model;


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
	private Integer idProveedor;
	

}
