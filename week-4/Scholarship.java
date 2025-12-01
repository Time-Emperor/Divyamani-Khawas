import java.util.Scanner;
class Scholarship{
    public static void main(String[] args){
        Scanner y=new Scanner (System.in);
        System.out.println("Enter your GPA:");
        double GPA= y.nextDouble() ;
        System.out.println("Enter your Attendance:");
        double Attendance= y.nextDouble() ;
        System.out.println("Enter your Attitude_Score:");
        double Attitude_Score= y.nextDouble() ;
        if(GPA>4 || GPA<0){
            System.out.println("Please Enter Valid GPA!");
        }
        if(Attendance>100 || Attendance<0){
            System.out.println("Please Enter Valid Attendance!");
        }
        if(Attitude_Score>10 || Attitude_Score<0){
            System.out.println("Please Enter Valid Attitude_Score!");
        }
        if (GPA >=3.2 && GPA<=4){
             if (Attendance >= 80 && Attendance <= 100) {
                if (Attitude_Score >5 && Attitude_Score <=10){
                    System.out.println("You are eligible for scholarship!");
                }
            }
        }else{
            System.out.println("You are not eligible for Scholarship!");
        }
    }
}