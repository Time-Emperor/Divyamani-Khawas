import java.util.Scanner;
public class PaperSize{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("        Paper Size      ");
    System.out.println("Available paper sizes: 0, A1, A2, A3, A4, A5");
    System.out.println("Enter paper size:");
    String PaperSize=sc.nextLine();
    
    switch(PaperSize){
        case "A0":
            System.out.println("Dimensions in mm:841 * 46.8 mm");
            System.out.println("Dimensions in inches:33.1 * 46.8 inches");
            break;
        case "A1":
            System.out.println("Dimensions in mm:594*841 mm");
            System.out.println("Dimensions in inches:23.4*33.1 inches");
            break;
        case "2":
               System.out.println("Dimensions in mm:429*594 mm");
               System.out.println("Dimensions in inches:16.5*23.4 inches");
            break;
        case "A3":
            System.out.println("Dimensions in mm:297*420 mm");
            System.out.println("Dimensions in inches:11.7*16.5 inches");
            break;
        case "A4":
            System.out.println("Dimensions in mm:210*420 mm");
            System.out.println("Dimensions in inches:8.3*11.7 inches");
            break;
        case "A5":
            System.out.println("Dimensions in mm:148*210 mm");
            System.out.println("Dimensions in inches:5.8*8.3 inches");
            break;
        
        default:
            System.out.println("Invalid papersize");
    
    }
    }
    
}