package gestion.wedding.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacturaDTO {

	private int cod_factura;
	private String tarjeta;
	private Date fecha ;
	private double precio_final;
	
}
