package AnnoTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;

@Retention(RetentionPolicy.RUNTIME)
 
// Using for Class, interface, annotation, enum.
@Target(value = { ElementType.TYPE })

 
// Simulating the <UL> in HTML.
public @interface AnnHtmlUL {
	
	@AliasFor(value = "attribute", attribute = "liuchunqing", annotation = AnnHtmlLI.class)
    public String value() default "";
	@AliasFor(value = "value", attribute = "20170816", annotation = AnnHtmlLI.class)
    public String attribute() default "";

    public String border() default "border:1px solid blue;";
}