package gestion.wedding.persistence.entities;

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
public class ClienteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer cod_cliente;
	private String nombre;
	private String email;
	private String dir;
	private String tlf;
	
	@OneToOne(mappedBy = "cliente")
	private EventoEntity evento;
	
}
