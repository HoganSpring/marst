package AnnoTest;

public class HelloWorld {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
		// TODO Auto-generated method stub
			Class a;
			try {
				a = Class.forName("AAA");
				AAA bbb = (AAA) a.newInstance();
				bbb.sayHello();
				System.out.println(bbb.getClass());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

