package gestion.wedding.model;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventoDTO {
	
	private Integer id_evento;
	private Integer num_invitados;
	private Date fecha;
	private List<ServicioDTO> servicios;
	private Integer cod_cliente;
	private Double precio;
	
	//
	private List<FacturaDTO> factura;
	

}
