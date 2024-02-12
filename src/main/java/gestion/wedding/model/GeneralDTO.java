package gestion.wedding.model;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneralDTO {
	
	
	private Integer numeroInvitados;
	private Date fechaEvento;
	private List<ServicioDTO> listaServicios;
	private Double precioTotal;
	private String nombreCliente;
	private String email;
	private String direccion;
	private String telefono;
	private String tarjeta;
	private double precioFactura;
	

}
