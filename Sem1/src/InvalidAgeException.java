// программа должна запрашивать ваш возраст, если он не от 0 до 120
// программа выбрасывает исключение InvalidAgeExeption
// если не число, тогда код NuberFormatException с ссобщением "некорректный формат числа"
// в остальных случаях программа выводит  "Ваш возраст: [age]"



public class InvalidAgeException extends RuntimeException{
        public InvalidAgeException(String message) {
            super(message);
        }    
     }
                


