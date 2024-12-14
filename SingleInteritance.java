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
class SingleInheritance{
    public static void main(String args[]){
        a.h=new a();
        h.pl();
        b.y=new b();
        y.pl();
        y.r();
    }
}