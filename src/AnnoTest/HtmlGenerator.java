package AnnoTest;

import java.awt.List;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.springframework.core.annotation.AliasFor;

import AnnoTest.AnnHtmlLI.GenderType;
import jdk.nashorn.internal.ir.annotations.Reference;



public class HtmlGenerator {

	public static void main(String[] args) {

        Class<?> clazz = DocumentClass.class;
        
        boolean isHtmlUL = clazz.isAnnotationPresent(AnnHtmlUL.class);

        StringBuilder sb = new StringBuilder();
        if (isHtmlUL) {
            // Get the AnnHtmlUL annotation on this class.
            AnnHtmlUL annUL = clazz.getAnnotation(AnnHtmlUL.class);
            
            Method[] me1s = AnnHtmlUL.class.getMethods();
            for(Method me1 : me1s){
            	if(me1.isAnnotationPresent(AliasFor.class))
            	{
            		AliasFor alia = me1.getAnnotation(AliasFor.class);
            		
            		System.out.println(alia.value() +" | "+ alia.attribute()+" | " + alia.annotation());
            		
            	}
            	
            }
            
        }
    
    }
   
    // Write to Console (Or file)
    private static void writeToFile(String fileName, StringBuilder sb) {
        System.out.println(sb);
    }
}
