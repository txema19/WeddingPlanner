package gestion.wedding.persistence.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FacturaEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int cod_factura;
	private String tarjeta;
	private Date fecha ;
	private double precio_final;
	
}
