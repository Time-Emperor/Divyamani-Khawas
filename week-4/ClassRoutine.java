import java.util.Scanner;
public class ClassRoutine{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your day:");
    String day = sc.nextLine();
    switch(day) {
        case "sunday":
            System.out.print("Today is Lecture!"); break;
        case "monday":
            System.out.print("Today is Lecture!");break;
        case "tuesday":
            System.out.print("Today is Tutorial!");break;
        case "wednesday":
            System.out.print("Today is Tutorial!");break;
        case "thursday":
            System.out.print("Today is Workshop");break;
        case "friday":
            System.out.print("Today is Workshop");break;
        case "saturday":
            System.out.print("Today is Holyday");break;
            default:
                System.out.print("Invalid day");
    }
    
}}
    

    
    