import java.util.Scanner;
class FixedDepositNIB{
    public static void main(String[] args){
        Scanner y= new Scanner (System.in);
        boolean ant = true;
        while(ant){
            System.out.println("Enter your amount: ");
            double amt= y.nextDouble();
            if(amt<= 1000){
            System.out.println("Minimum deposit must be 1000!!!"); continue;
            }
            System.out.println("Enter the rate percentage: ");
            double ratepercent=y.nextDouble();
            if(ratepercent>12 || ratepercent<8){
                System.out.println("rate percent should be in the range of 8%-12% "); continue;
            }
            double rate= ratepercent/100 ;
            System.out.println("Enter the time: ");
            double t= y.nextDouble();
            if(t>5 || t<0){
                System.out.println("Error: Duration must be between 1 - 5 years"); continue;
            }
            double fee= amt *0.005;
            double interest= amt * Math.pow((1+(rate/12)),(12*t));
            double finalamt= interest - fee;
            System.out.println("----------------------------------------------");
            System.out.println("Monthly compound interest :" +interest);
            System.out.println("Processing fee :" +fee);
            System.out.println("Final amt:" +finalamt);
            System.out.println("----------------------------------------------");
            System.out.println("Do you want to calculate another FD? (Yes/No)");
            String choice=y.next().toLowerCase();
            if(!choice.equals("yes") && !choice.equals("no")){
                System.out.println("Please enter yes or no");
            }
            else if (choice.equals("no")){
                ant = false;
            }
        }
    }
}