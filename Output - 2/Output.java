class Exam{
    double marks;
    int min;
    public Exam( ){
        System.out.println("E-E");
    }
    public Exam(int min, double marks){
        this( );
        this.min = min; 
        this.marks = marks;
        System.out.println("P-E");
    }
    public void show(String s){
        System.out.println(s + "Exam");
        System.out.println("Marks: "+marks+" Min: "+min);
    }
}

class Midterm extends Exam{

    private int day, slot;

    public void setDay(int day){
        this.day = day;
    }
    public void setSlot(int slot){
        this.slot = slot;
    }
    public int getDay( ){
        return day;
    }
    public int getSlot( ){
        return slot;
    }
    public Midterm( ){
        super(120,100.0);
    }
    public Midterm(int day, int slot, int min, double marks){
        this.day = day; 
        this.slot = slot;
        super.min = min; 
        super.marks = marks;
        System.out.println("P-M");
    }
    public void show(String s){
        super.show(s);
        System.out.println("Day: "+slot+" Slot: "+day);
    }
}
   public class Output{
    public static void main(String [ ]args){

    Midterm setA = new Midterm(5, 3, 120, 100.0);
    Midterm setB = new Midterm( );

    setA.show("Mid");
    setB.show("No");

    }
}
   