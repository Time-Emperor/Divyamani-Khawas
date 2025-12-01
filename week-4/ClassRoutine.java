import java.util.Scanner;
class ClassRoutine{
    public static void main(String[] args){
        Scanner y=new Scanner(System.in);
        System.out.println("Enter a Day:");
        String Day=y.nextLine().toLowerCase();
        switch (Day){
            case "Sunday":
                System.out.println("Today is Lecture!"); break;
            case "Monday":
                System.out.println("Today is Lecture!"); break;
            case "Tuesday":
                System.out.println("Today is Tutorial!"); break;
            case "Wednasday":
                System.out.println("Today is Tutorial!"); break;
            case "Thursday":
                System.out.println("Today is Workshop!"); break;
            case "Friday":
                System.out.println("Today is Workshop!"); break;
            default:
                System.out.println("Today is Holiday!"); break;
        
        }
    }
    
}