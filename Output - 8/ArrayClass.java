import java.lang.*;

public class ArrayClass{

    private String name;
    private int id;

    public static void main(String[] args) {
        
        ArrayClass ac1 = new ArrayClass();
        ArrayClass ac2 = new ArrayClass();

        ac1.name = "Tahsin";
        ac1.id = 24;

        ac2.name = "Disha";
        ac2.id = 27;


        ArrayClass ar1[] = new ArrayClass[2];
        ar1[0] = ac1;
        ar1[1] = ac2;

        for(int i=0; i<ar1.length; i++){
            System.out.println(ar1[i].name);
            System.out.println(ar1[i].id);
        }
    }
}