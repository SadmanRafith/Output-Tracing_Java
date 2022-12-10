import java.lang.*;

public class Output1{
    public static void main(String[] args) {
        System.out.println("\nOutput String - 1\n");

        //------------------- String Literal
        String s1 = "HELLO";
        String s2 = "hello";
        String s3 = "Tahsin";
        String s4 = "HELLO";

        String obj1 = new String("TAHSIN");
        String obj2 = new String("Tahsin");
        String obj3 = new String("Hasib");
        String obj4 = new String("TAHSIN");

        //----------------------------------- .isEmpty()
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

        //----------------------------------- .isBlank()
        System.out.println(s1.isBlank());
        System.out.println(s2.isBlank());

        // .isEmpty() and .isBlank() are same

        //-------------------------------------- .length()
        System.out.println("\nLength of s1 = "+s1.length());
        System.out.println("Length of s2 = "+s2.length());

        //int length = s1.length();
        //System.out.println("Length of s1 : "+length);

        //-------------------------------------- .charAt()
        System.out.println("\nCharacter at = "+s1.charAt(1));
        System.out.println("Character at = "+s2.charAt(1));

        //char C = s1.charAt(1);
        //System.out.println("Character at : "+C);


        //------------ if else for string literal
        if(s1 == s3){
            System.out.println("\n(s1 == s3) True");
        }
        else{
            System.out.println("\n(s1 == s3) False");
        }
        if(s1 == s4){
            System.out.println("\n(s1 == s4) True");
        }
        else{
            System.out.println("\n(s1 == s4) False");
        }


        //--------------------------------------- .equals()
        System.out.println("\nChecking equality of s1 & s2 = "+s1.equals(s2));
        System.out.println("Cheching equality of s1 & s3 = "+s1.equals(s3));
        System.out.println("Cheching equality of s1 & s4 = "+s1.equals(s4));


        //------------ if else for string object
        if(obj1 == obj3){
            System.out.println("\n(obj1 == obj3) True");
        }
        else{
            System.out.println("\n(obj1 == obj3) False");
        }
        if(obj1 == obj4){
            System.out.println("\n(obj1 == obj4) True");
        }
        else{
            System.out.println("\n(obj1 == obj4) False");
        }

        System.out.println("\nChecking equality of obj1 & obj2 = "+obj1.equals(obj2));
        System.out.println("Cheching equality of obj1 & obj3 = "+obj1.equals(obj3));
        System.out.println("Cheching equality of obj1 & obj4 = "+obj1.equals(obj4));

        //----------------------------------- for same word but uppercase and lowercase (String Literal)
        if(s1 == s2){
            System.out.println("\nsame word but uppercase and lowercase (s1 == s2) True");
        }
        else{
            System.out.println("\nsame word but uppercase and lowercase (s1 == s2) False");
        }

        //------------------------------------ for same word but uppercase and lowercase (String object)
        if(obj1 == obj2){
            System.out.println("\nsame word but uppercase and lowercase (obj1 == obj2) True");
        }
        else{
            System.out.println("\nsame word but uppercase and lowercase (obj1 == obj2) False");
        }


        //----------------------------------------  .substring(n,n) where n = index number
        // begin index is inclusive and end index is exclusive
        // end index is always (n-1)

        System.out.println("\nSubstring example s1 : "+s1.substring(2,4));
        System.out.println("Substring example s1 : "+s1.substring(0,1));
        System.out.println("Substring example s3 : "+s3.substring(0,1));
        System.out.println("Substring example s3 : "+s3.substring(3,5));
        System.out.println("Substring example s3 : "+s3.substring(1,3));

        //----------------------------------------------------------- .indexOf()
        // here (" ") and (' ') works same

        System.out.println("\nIndex of s1 : "+s1.indexOf("E"));
        System.out.println("Index of ob1 : "+obj1.indexOf("S"));
        System.out.println("Index of ob1 : "+obj1.indexOf("W"));
        System.out.println("Index of s1 : "+s1.indexOf('O'));
        System.out.println("Index of s1 : "+s1.indexOf('p'));
        System.out.println("Index of s1 : "+s1.indexOf(5)); 

        /*
         * Lastly, when we pass in a character or substring that doesn't exist in a string, 
         * the indexOf method will return a value of -1.
         */

        //----------------------------------------------------- .concat()
        System.out.println("\nConcat = "+s1.concat(s2));
        System.out.println("After concating : "+s1);

        s1 = s1.concat(s2);
        System.out.println();
        System.out.println("After concating and initializing : "+s1);
    }
}