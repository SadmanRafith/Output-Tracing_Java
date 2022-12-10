import java.lang.*;

//Normal constructor case

class Parent{

    private int var;

    public Parent(){
        System.out.println("Empty P");
    }
    public Parent(int a){                
        var = a;
        System.out.println("Parameterized! P");
    }
}

public class ConstructorCall extends Parent{
    public ConstructorCall(){
        System.out.println("Empty C");
    }
    public ConstructorCall(int a){
        super(a);
        System.out.println("Parameterized! C");
    }
    public static void main(String[] args) {
        ConstructorCall c = new ConstructorCall(8);
        ConstructorCall c1 = new ConstructorCall();
    }
}