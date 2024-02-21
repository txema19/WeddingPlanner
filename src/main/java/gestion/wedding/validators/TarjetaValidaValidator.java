package gestion.wedding.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TarjetaValidaValidator implements ConstraintValidator<TarjetaValida, String>{

	
	 @Override
	    public void initialize(TarjetaValida constraintAnnotation) {
	    }

	    @Override
	    public boolean isValid(String tarjeta, ConstraintValidatorContext context) {
	        // Verificar si la tarjeta cumple con los criterios especificados
	        return tarjeta != null && tarjeta.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}");
	    }
	    
}
