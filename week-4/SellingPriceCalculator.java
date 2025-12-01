import java.util.Scanner;
public class SellingPriceCalculator
{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the Marked Price:");
        double MP=x.nextDouble();
        System.out.println("Enter the Category(A/B/C/D):");
        String Category=x.next();
        double DiscountPercent=0;
        switch (Category){
            case "A":
                DiscountPercent=60; break;
            case "B":
                DiscountPercent=40; break;
            case "C":
                DiscountPercent=20; break;
            case "D":
                DiscountPercent=10; break;
            default:
                System.out.println("Please! Enter a valid Category!");
        }
        double DiscountAmount=(DiscountPercent/100) * MP;
        double SP= MP- DiscountAmount;
        System.out.println("Discount %:" +DiscountPercent);
        System.out.println("DiscountAmount:" +DiscountAmount);
        System.out.println("SP:" +SP);
    }
}