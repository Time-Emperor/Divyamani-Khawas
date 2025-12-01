import java.util.Scanner;
class NumberChecker{
    public static void main(String[] args){
        Scanner y= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=y.nextInt();
        if(num %2==0){
            System.out.println("The given number is even!");
        }else{
            System.out.println("The given number number is odd!");
        }
    }
}
