import java.util.*;
class a{
    public void pl(){
        System.out.println("HELLO STUDENTS");
    }
}
class b extends a{
    public void r(){
        System.out.println("HELLO TEACHERS");
    }
}
class c extends b{
    public void r1{
        System.out.println("HELLO PROFESSORS");
    }
}
class Main{
    public static void main(String args[]){
        b h=new b();
        h.r();
        h.p1();
        c h1=new c();
        h1.r1();
        h1.pl();
    }
}