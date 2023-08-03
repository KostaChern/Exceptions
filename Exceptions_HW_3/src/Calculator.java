import java.util.Scanner;
import exceptions.ArithmeticOperationsException;
import exceptions.InvalidInputException;

public class Calculator {
     /**
     * Метод запрашивает у пользователя основание и показатель степени с помощью класса Scanner
     * и выполняет операции (+, -, *, /, возведение в степень) над ними. Если введены некорректные числа или происходит
     * деление на ноль, соответствующие ошибки выводятся на экран.
     */
    private static void goCalculator() {
        Scanner scanner = new Scanner(System.in);
        double basis = 0, degree = 0;

        try {
            System.out.print("Введите начальное число: ");
            basis = Double.parseDouble(scanner.nextLine());

            System.out.print("Введите второе число: ");
            degree = Double.parseDouble(scanner.nextLine());

            double additionResult = basis + degree;
            System.out.println("Сумма чисел: " + additionResult);

            double subtractionResult = basis - degree;
            System.out.println("Разница чисел: " + subtractionResult);

            double multiplicationResult = basis * degree;
            System.out.println("Результат умножения: " + multiplicationResult);

            if (degree != 0) {
                double divisionResult = basis / degree;
                System.out.println("Результат деления: " + divisionResult);
            } else {
                System.out.println("Ошибка: деление на 0 не возможно");
            }

            try {
                double powerResult = PowerCalculator.calculatePower(basis, degree);
                System.out.println("Возведение в степень: " + powerResult);
            } catch (InvalidInputException | ArithmeticOperationsException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибочный ввод, введите корректное число");
    }
    }

    /**
     * Метод запускает калькулятор в цикле, чтобы дать пользователю возможность повторить ввод,
     * если был введен некорректный ввод.
     */
   
    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            goCalculator();
            System.out.print("Would you like to perform another calculation? (Y/N): ");
            String choice = new Scanner(System.in).nextLine().toUpperCase();
            if (!choice.equals("Y")) {
                isRunning = false;
            }
        }
    }
}
