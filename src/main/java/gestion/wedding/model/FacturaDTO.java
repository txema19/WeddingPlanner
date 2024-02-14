package gestion.wedding.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacturaDTO {

	private Integer id_factura;
	private String tarjeta;
	private Date fecha ;
	private Double precio_final;
	private Integer id_evento;
	
}
