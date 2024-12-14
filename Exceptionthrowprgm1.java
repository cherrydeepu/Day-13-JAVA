import java.util.*;
 public class Exceptionthrowprgm1{
    public static void main(String args[]){
        try{
            throw new Exception("Pandu");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}