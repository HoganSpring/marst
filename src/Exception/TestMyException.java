package Exception;

/**
 * @Title: TestMyException.java
 * @Package Exception
 * @Description: TODO
 * @author chunqingliu
 * @date 2017年8月30日 下午2:30:52
 * @version V0.0.1
 * 
 */

public class TestMyException {
	public void check(int n) /*throws MyException*/ {
		/*if (n < 0) {
			throw new MyException(n);// 抛出异常，结束方法check()时执行
		}*/
		double number = Math.sqrt(n);
		System.out.println(n + "的平方根是" + number);
	}

	public static void main(String[] args) {
		TestMyException test = new TestMyException();
		try {
			test.check(8);// 一般在最后调用该法的的方法（如main）体中处理异常
			test.check(-2);
		} catch (MyException e) {// 必须要捕获异常
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
