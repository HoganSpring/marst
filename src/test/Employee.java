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
			// ��ʱ����method��toString����������������Ҫ���û�Ҳ�����Լ�ƴ�����
			// System.out.println(me[i]);
			// ȡ�����η�
			System.out.print(Modifier.toString(me[i].getModifiers()) + " ");
			// ȡ�÷���ֵ����
			System.out.print(me[i].getReturnType().getSimpleName() + " ");
			// ȡ�÷�������
			System.out.print(me[i].getName() + "(");
			// ȡ�÷�������
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
			// ȡ���쳣
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