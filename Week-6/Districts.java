import java.util.Scanner;
public class Districts
{
    public static void main(String[] args){
        String [] districts={"Morang","Kathmandu","Kaski","Sindhuli"};
        for(int i=0; i< districts.length; i++){
            System.out.println((i+1)+"."+districts[i]);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of districts you want:");
        int numberofdistrict=scanner.nextInt();
        scanner.nextLine();
        districts=new String[numberofdistrict];
        for(int i=0; i< districts.length; i++){
            System.out.println("Enter name for district " + (i+1)+":");
            districts[i]=scanner.nextLine();
        }
        System.out.println("Updated List");
        for(int i =0; i< districts.length;i++){
            System.out.println((i+1)+"."+districts[i]);
        }
        scanner.close();
    }
}