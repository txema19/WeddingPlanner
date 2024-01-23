package gestion.wedding.persistence.entities;

import java.util.Date;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EventoEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_evento;
    private Integer num_invitados;
    private Date fecha;

    @OneToOne
    @JoinColumn(name = "id_factura") 
    private FacturaEntity factura;  

    @OneToMany(mappedBy = "evento")
    private List<ServicioEntity> servicios;

    private Integer cod_cliente;

}
