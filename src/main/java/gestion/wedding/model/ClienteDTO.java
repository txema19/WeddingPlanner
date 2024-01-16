package gestion.wedding.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
	
	private Integer cod_cliente;
	private String nombre;
	private String email;
	private String dir;
	private String tlf;

}
