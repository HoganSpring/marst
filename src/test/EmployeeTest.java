package test;

import java.awt.List;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

public class EmployeeTest {
	public static void main(String[] args) throws Exception {
		String s1 = "hello";
		//參数为函数名，函数的參数（可变长）
		
		ArrayList<String> listtest = new ArrayList();
		ArrayList<Integer> listtest1 = new ArrayList();
		
		Collection collection = new ArrayList();
		collection.add(new Integer("1"));
		collection.add(new String("1"));
		
		listtest.add("800");
		listtest1.add(800);
		String str = listtest.get(0).toString();
		
		System.out.println(listtest.getClass() == listtest1.getClass());
		System.out.println(listtest.getClass().getName());
		
		Method m = s1.getClass().getMethod("charAt", int.class);
		//參数为要调用的对象，以及函数的參数。这里假设第一个參数为null，表示调用的是类的静态方法
		System.out.println(int.class);
		System.out.println(m.invoke(s1, 1));
	}
}
