package Exception;
/**
* @Title: MyException.java 
* @Package Exception 
* @Description: TODO 
* @author chunqingliu
* @date 2017年8月30日 下午2:16:04 
* @version V0.0.1
*    
*/

public class MyException extends RuntimeException{
	String message;  
    public MyException(int n) {  
        message = n+"不是正数";  
    }  
    public String getMessage() {  
        return message;  
    }  
    public void setMessage(String message) {  
        this.message = message;  
    }  
}
