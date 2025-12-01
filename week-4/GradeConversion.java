import java.util.Scanner;
class GradeConversion{
    public static void main(String[] args){
        Scanner y=new Scanner(System.in);
        System.out.println("Enter your GPA:");
        double gpa= y.nextDouble();
        if (gpa<0.00 || gpa>4.00)
        {
        System.out.println("Enter the valid gpa!");
        }
        String grade="";
        if (gpa>3.60){
        System.out.println("You have secured A+!");}
         else if (gpa>3.20 && gpa<=3.60){
        System.out.println("You have secured A!");}
         else if (gpa>2.80 && gpa<=3.30){
        System.out.println("You have secured B+!");}
         else if (gpa>2.40 && gpa<=2.80){
        System.out.println("You have secured B!");}
         else if (gpa>2.00 && gpa<=2.40){
        System.out.println("You have secured C+!");}
         else if (gpa>1.60 && gpa<=2.00){
        System.out.println("You have secured C!");}
         else if (gpa>1.20 && gpa<=1.60){
        System.out.println("You have secured D+!");}
         else{
        System.out.println("You have failed!");}
    }
}