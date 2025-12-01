import java.util.Scanner;
class PositiveNegativeChecker{
    public static void main(String[] args){
        Scanner y= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=y.nextInt();
        if(num > 0){
            System.out.println("The given number is Positive!");
        }else if(num < 0){
            System.out.println("The given number number is Negative!");
        }else{
            System.out.println("The given number is Zero!");
        }
    }
}