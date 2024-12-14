import java.util.*;
class gp{
    public void(){
        System.out.println("Hello , i'm grand parent");
    }
}
class p1 extends gp{
    public void r1(){
        System.out.println("Hello, i'm Parent 1");
    }
}
interface p2{
    void r2();
}
class d extends p1 implements p2{
    public void r2(){
        System.out.println("Hello,i'm parent 2");
    }
    public void r3()
    {
        System.out.println("Hello,i'm child class");
    }
}
public class Main{
  public static void main(String args[]){
    d h=new d();
    h.r();
    h.r1();
    h.r2();
    h.r3();
  }

}