package gestion.wedding.persistence.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
    private Integer id_factura;
    private String tarjeta;
    private Date fecha;
    private double precio_final;
    //private Integer id_evento;
    
    @OneToOne
    @JoinColumn(name = "id_evento")
    private EventoEntity evento;  
    
}
