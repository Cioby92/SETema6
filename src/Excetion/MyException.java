package Excetion;

/**
 * Created by Ciobotaru on 30.11.2014.
 */
public class MyException extends Exception{
    public MyException(String input,String ErrMessage) {
        super("MyException on :" + input+"  :"+ErrMessage);
    }
}
