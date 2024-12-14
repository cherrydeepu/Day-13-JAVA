import java.util.*;
public class ExceptionFinally{
    public static void main(String args[]){
        //try catch block
        try{
            int d=90/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Rishitha");
        }
        //try catch and finally
        try{
            int d=90/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Pandu");
        }
        finally{
            System.out.println("Rishitha Pandu");
        }
    }
}
