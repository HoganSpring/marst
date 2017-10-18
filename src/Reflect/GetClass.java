package Reflect;

import com.sun.scenario.effect.Reflection;

public class GetClass {  
	  
    public boolean ClassCheck(){  
        try {  
              
            System.out.println("��һ�֣�ͨ���౾���ö���");  
            Class UserClass = this.getClass();  
            System.out.println("��һ�ַ�ʽ�ɹ���������"+UserClass.toString()+"\n");  
              
            System.out.println("�ڶ��֣�ͨ������ʵ����ȡ����");  
            UserInfo ui = new UserInfo();  
            UserClass = ui.getClass();  
            Class SubUserClass = UserClass.getSuperclass();  
            System.out.println("�ڶ��ַ�ʽ�ɹ���������"+SubUserClass.toString()+"\n");  
              
            System.out.println("�����֣�ͨ��������.class��ö���");  
            Class ForClass = Reflect.UserInfo.class;  
            System.out.println("�����ַ�ʽ�ɹ���������"+ForClass.toString()+"\n");  
              
            System.out.println("�����֣�ͨ���������ַ�����ö���");  
            Class ForName = Class.forName("Reflect.UserInfo");  
            System.out.println("�����ַ�ʽ�ɹ���������"+ForName.toString()+"\n");  
              
        } catch (Exception e) {  
            e.printStackTrace();  
            return false;  
        }  
        return true;  
    }  
      
    @Override  
    public String toString(){  
        return this.getClass().getName();  
    }  
      
    public static void main(String[] args) {  
        GetClass gc = new GetClass();  

        if (gc.ClassCheck()) {  
            System.out.println("���з���ȫ���ɹ���");  
        }  
        else {  
            System.out.println("���������⣬���飡");  
        }  

    }  
 
  
}  