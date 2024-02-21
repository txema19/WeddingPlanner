package gestion.wedding.model;

import java.util.Date;
import java.util.List;

import gestion.wedding.validators.EmailValido;
import gestion.wedding.validators.TarjetaValida;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
	@NotBlank
	private String nombreCliente;
	@EmailValido
	private String email;
	private String direccion;
	@NotBlank
	private String telefono;
	@TarjetaValida
	private String tarjeta;
	private double precioFactura;
	

}