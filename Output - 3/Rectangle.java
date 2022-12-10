import java.io.*;

public class Rectangle{
 float length, width;
 private Rectangle( ){ }
 public Rectangle(float L, float W){
 length=L;
 width=W;
 }
 public static void main(String [ ]args){
 Rectangle r1 = new Rectangle( );
 Rectangle r2 = new Rectangle(1.0F,2.0F);
 System.out.print(r1.length+" "+r2.width);
 }
}