//пример класса пользовательского исключения, наследуещогося от Exception 
//public class CustomException extends Exception{
//         конструктор с сообщением об ошибке
//         public CustomException(String messaage){
//               super(message);
//         }
//}


public class App {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(divident:10, divisor:0);
            System.out.println("Result: " + result);
        } catch (CustomException ex) {
            System.out.println("Caught CustomException: " + ex.getMessage());
        }
    }
    public static int divideNumbers(int divident, int divisor) throws CustomException {
        if (divisor == 0) {
            throw new CustomException(message:"Division by zero is not allowed.");
        }
        return divident / divisor;
    }
}
