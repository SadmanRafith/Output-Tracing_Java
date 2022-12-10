import java.lang.*;

class Account{

    private int accountNo;
    private double balance;
    public static int perDayTransactionLimit;

    public Account(int a, double b){
        accountNo = a; 
        balance = b;
        perDayTransactionLimit = 5;
    }
    public void printValues( ){
        System.out.println("AccNo: "+ accountNo);
        System.out.println("Balance: "+ balance);
        System.out.println("Limit: "+ perDayTransactionLimit);
    } 
    public void changeValue(int n){
        perDayTransactionLimit++;
        System.out.println("Confusing???");
    }
}

public class MainDemo{
    public static void main(String args[ ]){

    Account a1 = new Account(1111, 2000.0);
    Account a2 = new Account(2222, 2500.0);

    a1.printValues( );

    Account.perDayTransactionLimit = 7;

    a2.printValues( );
    a1.changeValue(10);
    a2.printValues( );

   }
}
   