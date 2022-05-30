package JavaJava;

interface A1 {
    public void aMethod();
}
interface B1{
    public void bMethod();
}
interface C1 extends A1, B1{
    public void cMethod();
}

class A_class implements B1{
    public void bMethod(){
        System.out.println("class A_class");
    }
}

class B_class extends A_class implements C1{
    public void aMethod(){}
    public void bMethod(){
        System.out.println("class B_class");
    }
    public void cMethod(){}
}
public class InterfaceTest {
    public static void main(String[] args) {
        A_class a = new A_class();
        a.bMethod();
        a=new B_class();
        a.bMethod();
        B_class b = (B_class)a;
        b.bMethod();
    }
}
