package Testable;
import Encapsulation.ATM;
public class Test
{
   public static void main(String [] args){
       ATM a = new ATM();
       a.deposit(10000);
       System.out.println("Your total balance is : " + a.getBalance());
   }
}