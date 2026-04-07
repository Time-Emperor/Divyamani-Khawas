public class Test
{
     public void check(){
         try{
             int a=10;
             int b=0;
             int c=a/b;
             System.out.println(c);
         }catch(ArithmeticException e){
             throw new ArithmeticException("What");
         }
     }
     public static void main(String[] args){
         Test num = new Test();
         num.check();
     }
}