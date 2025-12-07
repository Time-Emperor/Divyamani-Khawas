import java.util.Scanner;
class TableGenerator{
    public static void main(String[] args){
        Scanner y= new Scanner (System.in);
            System.out.println("Enter your number: ");
             int num=y.nextInt(); 
            for(int i=1; i<=10;i++){
        System.out.println(num + "x" +i+"=" +(num * i));        
        }
    }
}