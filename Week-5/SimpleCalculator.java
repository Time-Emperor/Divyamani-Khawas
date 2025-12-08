import java.util.Scanner;
class SimpleCalculator{
    public static void main(String[] args){
        Scanner y= new Scanner (System.in);
        boolean ant = true;
        while(ant){
            System.out.println("Enter your first number: ");
            double num1= y.nextDouble();
            System.out.println("Enter your Second number: ");
            double num2= y.nextDouble();
            System.out.println("Enter the operator (+, -, *, /)");
            String js= y.next();
            double ans=0;
            switch (js) {
                case "+":
                    ans = num1 + num2; break;
                case "-":
                    ans = num1 - num2; break;
                case "*":
                    ans = num1 * num2; break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                        continue; // skip result + restart loop
                    }
                    ans= num1 / num2;
                    break;
                default : System.out.println("Invalid operation!");
                         continue;
                    }
            System.out.println("Result :" +ans);
            System.out.print("Do you want to stop? (yes/no): ");
            String choice = y.next().toLowerCase();
            if(!choice.equals("yes") && !choice.equals("no")){
                System.out.println("Please enter yes or no");
            }
            else if (choice.equals("yes")){
                ant = false;
            }
        }
   }
}
