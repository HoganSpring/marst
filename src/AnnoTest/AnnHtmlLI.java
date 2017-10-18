package AnnoTest;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.FIELD,ElementType.METHOD })
@Documented
 
// Simulating the <LI> in HTML.
public @interface AnnHtmlLI {

    public String background();

    public String color() default "red";
    
    public enum GenderType {  
        
        Male("ÄÐ"),  
        Female("Å®"),  
        Other("ÖÐÐÔ");  
  
        private String genderStr;  
  
        private GenderType(String arg0) {  
            this.genderStr = arg0;  
        }  
  
        @Override  
        public String toString() {  
            return genderStr;  
        }  
    }  
  
    GenderType gender() default GenderType.Male;  
}
