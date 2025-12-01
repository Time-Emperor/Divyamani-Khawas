import java.util.Scanner;

public class NepalTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("====================================");
        System.out.println("  NEPAL INCOME TAX CALCULATOR");
        System.out.println("====================================");
        System.out.print("Enter your annual income (NPR): ");
        
        double income = sc.nextDouble();
        double tax = 0;
        
        if (income < 0) {
            System.out.println("Error: Income cannot be negative!");
            sc.close();
            return;
        }
        
        System.out.println("\n--- TAX CALCULATION BREAKDOWN ---");
        
        if (income <= 500000) {
            tax = income * 0.01;
            System.out.println("Income up to NPR 500000");
            System.out.println("Tax at 1%: NPR " + tax);
        }

        else if (income <= 700000) {
            double bracket1 = 500000 * 0.01;
            double bracket2 = (income - 500000) * 0.10;
            tax = bracket1 + bracket2;
            
            System.out.println("First NPR 500000 at 1%: NPR " + bracket1);
            System.out.println("Next NPR " + (income - 500000) + " at 10%: NPR " + bracket2);
        }
  
        else if (income <= 1000000) {
            double bracket1 = 500000 * 0.01;
            double bracket2 = 200000 * 0.10;
            double bracket3 = (income - 700000) * 0.20;
            tax = bracket1 + bracket2 + bracket3;
            
            System.out.println("First NPR 500000 at 1%: NPR " + bracket1);
            System.out.println("Next NPR 200000 at 10%: NPR " + bracket2);
            System.out.println("Next NPR " + (income - 700000) + " at 20%: NPR " + bracket3);
        }
 
        else if (income <= 2000000) {
            double bracket1 = 500000 * 0.01;
            double bracket2 = 200000 * 0.10;
            double bracket3 = 300000 * 0.20;
            double bracket4 = (income - 1000000) * 0.30;
            tax = bracket1 + bracket2 + bracket3 + bracket4;
            
            System.out.println("First NPR 500000 at 1%: NPR " + bracket1);
            System.out.println("Next NPR 200000 at 10%: NPR " + bracket2);
            System.out.println("Next NPR 300000 at 20%: NPR " + bracket3);
            System.out.println("Next NPR " + (income - 1000000) + " at 30%: NPR " + bracket4);
        }

        else if (income <= 5000000) {
            double bracket1 = 500000 * 0.01;
            double bracket2 = 200000 * 0.10;
            double bracket3 = 300000 * 0.20;
            double bracket4 = 1000000 * 0.30;
            double bracket5 = (income - 2000000) * 0.36;
            tax = bracket1 + bracket2 + bracket3 + bracket4 + bracket5;
            
            System.out.println("First NPR 500000 at 1%: NPR " + bracket1);
            System.out.println("Next NPR 200000 at 10%: NPR " + bracket2);
            System.out.println("Next NPR 300000 at 20%: NPR " + bracket3);
            System.out.println("Next NPR 1000000 at 30%: NPR " + bracket4);
            System.out.println("Next NPR " + (income - 2000000) + " at 36%: NPR " + bracket5);
        }

        else {
            double bracket1 = 500000 * 0.01;
            double bracket2 = 200000 * 0.10;
            double bracket3 = 300000 * 0.20;
            double bracket4 = 1000000 * 0.30;
            double bracket5 = 3000000 * 0.36;
            double bracket6 = (income - 5000000) * 0.39;
            tax = bracket1 + bracket2 + bracket3 + bracket4 + bracket5 + bracket6;
            
            System.out.println("First NPR 500000 at 1%: NPR " + bracket1);
            System.out.println("Next NPR 200000 at 10%: NPR " + bracket2);
            System.out.println("Next NPR 300000 at 20%: NPR " + bracket3);
            System.out.println("Next NPR 1000000 at 30%: NPR " + bracket4);
            System.out.println("Next NPR 3000000 at 36%: NPR " + bracket5);
            System.out.println("Remaining NPR " + (income - 5000000) + " at 39%: NPR " + bracket6);
        }
        
        double netIncome = income - tax;
        
        System.out.println("\n====================================");
        System.out.println("SUMMARY");
        System.out.println("====================================");
        System.out.println("Gross Annual Income: NPR " + income);
        System.out.println("Total Tax Payable: NPR " + tax);
        System.out.println("Net Income: NPR " + netIncome);
        System.out.println("====================================");
        
        sc.close();
    }
}