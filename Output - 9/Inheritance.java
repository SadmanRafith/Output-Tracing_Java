import java.lang.*;

class A{
    private int a;
    public void AFUNC(){
        System.out.println("HI A");
    }
}

class B extends A{
    private int b;
    public void BFUNC(){
        System.out.println("HI B");
    }
}

public class Inheritance extends B{
    public static void main(String[] args) {

        Inheritance i1 = new Inheritance();
        A a1 = new A();

        System.out.println("HI INHERITANCE");
        i1.AFUNC();
        i1.BFUNC();
    }
}
