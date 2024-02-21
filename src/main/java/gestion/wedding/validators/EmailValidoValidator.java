package gestion.wedding.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailValidoValidator implements ConstraintValidator<EmailValido, String>{
	
    @Override
    public void initialize(EmailValido constraintAnnotation) {
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        // Verificar si el correo electrónico cumple con los criterios especificados
        return email != null && email.matches(".+@.+\\..+");
    }

}
