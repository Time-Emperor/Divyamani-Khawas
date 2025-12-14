public class SimpleNumbers
{
    public static void main(String[] args){
        int[] scores={10, 20, 30, 40, 50};
        for (int i=0; i<scores.length; i++){
            System.out.println(scores[i]);
        }
        int sum=0;
        for(int i=0; i<scores.length; i++){
            sum+=scores[i];
        }
        System.out.println("The sum of all the element is : "+sum);
        System.out.println("The average of all the element is: "+sum/5);
    }
}