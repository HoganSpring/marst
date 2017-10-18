package springtest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	

	@SuppressWarnings("resource")
	@Test
	public void test() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class testTypeForName = Class.forName("ClassPathXmlApplicationContext");
		ClassPathXmlApplicationContext context2 = (ClassPathXmlApplicationContext)testTypeForName.newInstance();
		ApplicationContext context;
		context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}
}