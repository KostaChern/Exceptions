//Вам необходимо создать пользовательский класс исключения "NegativeNumberException",
//который будет выбрасываться, когда в метод передается отрицательное число.
//Класс "NegativeNumberException" должен содержать следующие методы:
//Конструктор: Создайте конструктор с одним параметромтипа String,
//который принимает сообщение об ошибке. Это сообщение будет выводиться при обработке исключения.
// Метод getMessage: Создайте метод getMessage, который возвращает сообщение об ошибке,
// переданное в конструкторе.

package Task2;

import java.util.Scanner;

public class task2 {
     public static void NegativeNumber(int number){
         if(number<0){
                throw new NegativeNumberException("число меньше нуля");
         }
     }   
     public static void main(String[] args ) {
         Scanner sc = new Scanner(System.in);
         int number = Integer.parseInt(sc.nextLine());
         try {
              NegativeNumber(number);
                
         } catch (NegativeNumberException e) {
              System.out.println("число меньше нуля, метод сработал"); 
         }
     }        
}
