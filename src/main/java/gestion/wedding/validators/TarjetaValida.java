package gestion.wedding.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = TarjetaValidaValidator.class)
public @interface TarjetaValida {
	
	 String message() default "El número de tarjeta no es válido, el formato debe ser 0000-0000-0000-0000";
	    Class<?>[] groups() default {};
	    Class<? extends Payload>[] payload() default {};

}
