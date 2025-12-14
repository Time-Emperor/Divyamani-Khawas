import java.util.Scanner;
public class StudentArray{
    public static void main(String[] args){
        String[] names={"Asha","Ramesh","Sita","Binod","Sabita"};
    for(int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("----------------------");
        System.out.println(names[2]);
        System.out.println("----------------------");
    for(int i=0; i<names.length; i++){
            names[4]=("Sasuke");
            System.out.println(names[i]);
        }
        System.out.println("----------------------");
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a name");
        String name=x.next();
        System.out.println("----------------------");
        names[0]=name;
        for(int i=0; i<names.length; i++){
        System.out.println(names[i]);
    }
    }
}