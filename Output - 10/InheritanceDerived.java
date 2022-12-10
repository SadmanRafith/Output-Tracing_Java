import java.lang.*;

class A1{
    public void A1func(){
        System.out.println("A1");
    }
}

public class InheritanceDerived extends A1{

    public void IDfunc(){
        System.out.println("InhDer");
    }

    public static void main(String[] args) {
        A1 a1 = new A1();
        InheritanceDerived id = new InheritanceDerived();

        id.A1func();
        id.IDfunc();

    }

}