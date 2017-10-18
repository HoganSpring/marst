/**
 * @Title: maintest.java
 * @Package
 * @Description: TODO
 * @author chunqingliu
 * @date 2017年9月8日 下午3:53:03
 * @version V0.0.1
 * 
 */

public class maintest {

	public static void main(String args[]) throws InterruptedException {

		NotUsed o = null; // this class is not used, should not be initialized
		Child t = new Child(); // initializing sub class, should trigger super
								// class initialization
		System.out.println((Object) o == (Object) t);
		
		
		
		/*liuspring test commit    */
		
	}
}

/**
 * Super class to demonstrate that Super class is loaded and initialized before
 * Subclass.
 */
class Parent {
	static {
		System.out.println("static block of Super class is initialized");
	}
	{
		System.out.println("non static blocks in super class is initialized");
	}
}

/**
 * Java class which is not used in this program, consequently not loaded by JVM
 */
class NotUsed {
	static {
		System.out.println("NotUsed Class is initialized ");
	}
}

/**
 * Sub class of Parent, demonstrate when exactly sub class loading and
 * initialization occurs.
 */
class Child extends Parent {
	static {
		System.out.println("static block of Sub class is initialized in Java ");
	}
	{
		System.out.println("non static blocks in sub class is initialized");
	}
}
