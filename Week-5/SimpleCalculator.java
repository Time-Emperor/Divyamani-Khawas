import java.util.Scanner;
public class SimpleCalculator
{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double result=0;
        while(true){
            System.out.println("Enter the first number:");
            String input1 = scanner.nextLine();
            if (input1.equalsIgnoreCase("stop")){
                System.out.println("Exiting the calculator");
                break;}
                double num1;
                try{
                    num1= Double.parseDouble(input1);
                } catch (NumberFormatException e){
                  System.out.println("Invalid input. Please enter a valid number");
                  continue;
                }
                System.out.print ("Enter the second number:");
                String input2 = scanner.nextLine();
                double num2;
                try{
                    num2= Double.parseDouble(input2);
                }catch (NumberFormatException e){
                 System.out.println("Invalid input for the second number. Please try again");
                 continue;
                }
                System.out.print("Enter the operation(+,-,*,/):");
                String operation = scanner.nextLine();
                switch (operation){
                    case "+":
                        result = num1 + num2;
                        System.out.println("Result:" + num1+ "+"+ num2+"="+ result);
                        break;
                    case "-":
                        result=num1-num2;
                        System.out.println("Result:" +num1 + "-" +num2+ "=" +result);
                        break;
                     case "*":
                        result=num1*num2;
                        System.out.println("Result:" +num1 + "*" +num2+ "=" +result);
                        break;
                    case "/":
                        if (num2==0){
                            System.out.println("Error: Cannot divided by zero.");
                        } else{
                            result = num1/num2;
                            System.out.println("Result:" +num1 + "/" +num2+ "=" +result);
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operation. PLease use +,-,*,/");
                        break;
                }
            }
            scanner.close();
        }
    }