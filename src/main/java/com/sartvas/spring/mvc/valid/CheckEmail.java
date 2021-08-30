
package com.sartvas.spring.mvc.valid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author sartv
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
//@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {
    
    public String value() default "xyz.com";
    public String message() default "email must be xuz.com";
    
    public Class<?>[] groups() default{};
    public Class<? extends Payload>[] payload() default {};
}
