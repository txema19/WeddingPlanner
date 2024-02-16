package gestion.wedding.handlers;

import java.net.URI;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import gestion.wedding.exceptions.ProveedorNotFoundExcepcion;


@RestControllerAdvice
public class Excepciones {
	
	@ExceptionHandler(ProveedorNotFoundExcepcion.class)
	public ProblemDetail creacionServicioException(ProveedorNotFoundExcepcion e) {
		
		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
		problemDetail.setTitle("No existe el proveedor");	
		
		problemDetail.setProperty("timeStamp", Instant.now());

		return problemDetail;
	}
	
		
	

}
