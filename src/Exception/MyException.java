package Exception;
/**
* @Title: MyException.java 
* @Package Exception 
* @Description: TODO 
* @author chunqingliu
* @date 2017��8��30�� ����2:16:04 
* @version V0.0.1
*    
*/

public class MyException extends RuntimeException{
	String message;  
    public MyException(int n) {  
        message = n+"��������";  
    }  
    public String getMessage() {  
        return message;  
    }  
    public void setMessage(String message) {  
        this.message = message;  
    }  
}
