import java.util.*;
class a{
    public void r(){
        System.out.println("HELLO");
    }
}
class b extends a{
    public void r1(){
        super.r();
        System.out.println("Hello Teachers");
    }
}
class Main{
    public static void main(String args[]){
        b h=new b();
        h.r1();
    }
}
