package Exception;

/**
 * @Title: TestMyException.java
 * @Package Exception
 * @Description: TODO
 * @author chunqingliu
 * @date 2017��8��30�� ����2:30:52
 * @version V0.0.1
 * 
 */

public class TestMyException {
	public void check(int n) /*throws MyException*/ {
		/*if (n < 0) {
			throw new MyException(n);// �׳��쳣����������check()ʱִ��
		}*/
		double number = Math.sqrt(n);
		System.out.println(n + "��ƽ������" + number);
	}

	public static void main(String[] args) {
		TestMyException test = new TestMyException();
		try {
			test.check(8);// һ���������ø÷��ĵķ�������main�����д����쳣
			test.check(-2);
		} catch (MyException e) {// ����Ҫ�����쳣
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
