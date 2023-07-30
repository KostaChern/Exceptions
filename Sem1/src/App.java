import java.util.Scanner;



public class App {
    public static void main(String[] args) {
//         int arr[] = new int[4];
//         try{
//             System.out.println("вошли в блок try");
//             int c = Integer.parseInt("456hbjk");
//             int a = arr[10];
//             System.out.println("эту строку не увидим"+a);

//         }
//         catch (ArrayIndexOutOfBoundsException e){
//             System.out.println("попали в catch, сообщение: " + e.getMessage());
//         }
//         catch (NumberFormatException e){
//             System.out.println("попали в catch, сообщение: " + e.getMessage());
//         }
//         finally{
//             System.out.println("трам пампам");
        
//         }
//         System.out.println("продолжаем");
//     }

// public static void doSomething() throws MyCheckedException{
//     throw new MyCheckedException();
// }

    System.out.println("введите ваш возраст");
    Scanner scan = new Scanner(System.in);
    try{
       int age = Integer.parseInt(scan.nextLine());
       if(age>120 || age<0){
          throw new InvalidAgeException("неправильно введен возраст");
       }
       System.out.println("ваш возраст: " + age);
    }
    catch (NumberFormatException e){
       throw new NumberFormatException("некорректный формат ввода:" + e.getMessage());
    }
  }
}  


