import java.lang.*;

public class ClassA{
    private int nrmlVar;
    ClassA clsVar;

    public static void main(String[] args) {

        ClassA obj1 = new ClassA();

        System.out.println("\n Normal Variable : "+obj1.nrmlVar);
        System.out.println(" Class Variable : "+obj1.clsVar);

        // default value of class variable is null and instance variable is 0
    }
}