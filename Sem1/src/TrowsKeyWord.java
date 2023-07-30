public class TrowsKeyWord {
     public static void main(String[] args){
//          int a = doSomething(1, 2);
         try{
         int result = division(1, 1);
         System.out.println(result);
         int result2 = division(1, 0);
         System.out.println(result2);
         }   
         catch (Exception e){
         System.out.println(e.getMessage());
         }    
     }   
     
public static int division(int a, int b) throws ArithmeticException{
                 if(b == 0) throw new ArithmeticException("Делить на ноль нельзя");
                 return a/b;
} 
                
}
