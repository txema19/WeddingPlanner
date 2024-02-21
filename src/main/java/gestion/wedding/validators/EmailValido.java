package gestion.wedding.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = EmailValidoValidator.class)
public @interface EmailValido {
	
	String message() default "El correo electrónico no es válido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}


