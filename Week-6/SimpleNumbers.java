import java.util.Scanner;

class SimpleNumbers{
    public static void main(String[] x){
        int [] scores = {10, 20, 30, 40, 50};
        
        for (int score : scores){
            System.out.println(score);
        }
        int sum = 0; 
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];   
        } 
        System.out.println("Sum of all the scores: " + sum);
        
        int avg = sum / scores.length;
        System.out.println("Average of all the scores: " + avg);
        
        int high = scores[0];
        for(int i = 0; i < scores.length; i++){
            if(scores[i] > high){
                high = scores[i];
            }
        }
        System.out.println("The highest score in the array is: " + high);
        
        int low = scores[0];
        for(int i = 0; i < scores.length; i++){
            if(scores[i] < low){
                low = scores[i];
            }
        }
        System.out.println("The lowest score in the array is: " + low);
        
