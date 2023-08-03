import exceptions.InvalidInputException;
import exceptions.ArithmeticOperationsException;

/**
 * PowerCalculator - класс-утилита, предоставляющий метод для вычисления степени числа.
 */
public class PowerCalculator {

    /**
     * Вычисляет значение степени для основания и показателя степени, переданных в качестве аргументов.
     * Если основание равно нулю и показатель степени отрицательный, генерируется InvalidInputException.
     * Если результат возврата метода получается бесконечным или NaN, генерируется ArithmeticOperationsException.
     *
     * @param basis     число, которое нужно возвести в степень
     * @param degree степень, в которую нужно возвести base
     * @return double результат возведения в степень
     * @throws InvalidInputException         если основание равно нулю и показатель степени отрицательный
     * @throws ArithmeticOperationsException если результат вычислений равен бесконечности 
     */
    public static double calculatePower(double basis, double degree) throws ArithmeticOperationsException, InvalidInputException {
        if (basis == 0 && degree < 0) {
            throw new InvalidInputException("Не верный ввод: первое число 0 с отрицательной степенью не вычисляется");
        }
        double power = Math.pow(basis, degree);
        if (!Double.isFinite(power)) {
            throw new ArithmeticOperationsException("Бесконечное число, выход за пределы ");
        }
        return power;
    }
}