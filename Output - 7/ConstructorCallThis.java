import java.lang.*;

//this() constructor case

class Parent{

    private int var;

    public Parent(){
        System.out.println("Empty P");
    }
    public Parent(int a){   
        this();             
        var = a;
        System.out.println("Parameterized! P");
    }
}

public class ConstructorCallThis extends Parent{
    
    public ConstructorCallThis(){
        System.out.println("Empty C");
    }
    public ConstructorCallThis(int a){
        super(a);
        // simillar case with this();
        System.out.println("Parameterized! C");
    }
    public static void main(String[] args) {
        ConstructorCallThis c = new ConstructorCallThis(8);
        ConstructorCallThis c1 = new ConstructorCallThis();
    }
}