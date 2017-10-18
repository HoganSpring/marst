package test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

interface Message {
	public void get();
}

class Student1 implements Message {

	public void fun() {
	}

	public void print() {
	}

	public void get() {
	}
}

public class Employee {

	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("test.Student1");
		Method[] me = cls.getMethods();
		for (int i = 0; i < me.length; i++) {
			// 此时用了method的toString方法输出，如果有需要，用户也可以自己拼凑输出
			// System.out.println(me[i]);
			// 取得修饰符
			System.out.print(Modifier.toString(me[i].getModifiers()) + " ");
			// 取得返回值类型
			System.out.print(me[i].getReturnType().getSimpleName() + " ");
			// 取得方法名称
			System.out.print(me[i].getName() + "(");
			// 取得方法参数
			Class<?> params[] = me[i].getParameterTypes();
			if (params.length > 0) {
				for (int j = 0; j < params.length; j++) {
					System.out.print(params[j].getSimpleName() + " arg-" + j);
					if (j < params.length - 1) {
						System.out.print(", ");
					}
				}
			}
			System.out.print(") ");
			// 取得异常
			Class<?>[] exp = me[i].getExceptionTypes();
			if (exp.length > 0) {
				System.out.print("throws ");
				for (int j = 0; j < exp.length; j++) {
					System.out.print(exp[j].getSimpleName());
					if (j < exp.length - 1) {
						System.out.println(", ");
					}
				}
			}
			System.out.println("{}");
			System.out.println();
		}
	}
}