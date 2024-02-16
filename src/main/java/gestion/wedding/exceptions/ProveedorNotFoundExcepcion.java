package gestion.wedding.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProveedorNotFoundExcepcion extends RuntimeException{
	
	String mensaje;

	public ProveedorNotFoundExcepcion(String mensaje) {
		super(mensaje);
		
	}

	
}
