import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создаём объект scanner
        System.out.println("Input:");
        String input = scanner.nextLine(); // читаем строку с нашими переменными и матзнаком (в образце через пробелы)
        String result = Calculate.calc(input); //метод calc в классе Main
        System.out.println("Output:\n" + result); // Выводим результат в консоль
        scanner.close(); // Закрываем поток сканнера
    }
}

class Calculate {
    static String calc(String input) {
        String[] calcs = input.split(" "); // создаём массив calcs из разделенных по пробелу символов строки
        //System.out.println(Arrays.toString(calcs));// выводим в консоль calcs
        if (calcs.length != 3) {
            throw new IllegalArgumentException("Output:\nThrows Exception //т.к. формат математической операции не удовлетворяет " +
                    "заданию - два операнда и один оператор (+, -, /, *)");
            // исключаем более 3х символов не считая пробелы в строке
         }
        int[] numbers = new int[2]; //создаём массив numbers на 2 переменные
        try {
            numbers[0] = Integer.parseInt(calcs[0]); // первому элементу присваиваем значение Int первой переменной
            numbers[1] = Integer.parseInt(calcs[2]); // второму элементу присваиваем значение Int второй переменной
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Output:\nThrows Exception //числа должны быть целыми");//исключение если не тот тип переменных
        }
        //System.out.println(Arrays.toString(numbers)); // выводим в консоль массив с переменными

            int result = 0;
            int a = numbers[0];
            //System.out.println("a = " + a);
            if (a<1||a>10){
                throw new IllegalArgumentException("Output:\nThrows Exception //число вне диапазона от 1 до 10");//исключение
            }
            String op = calcs[1];
            //System.out.println("op = " + op);
            int b = numbers[1];
            //System.out.println("b = " + b);
            if (b<1||b>10){
                throw new IllegalArgumentException("Output:\nThrows Exception //число вне диапазона от 1 до 10");//исключение
            }
            String ops = "+-*/";
            if (!ops.contains(op)) {
                throw new IllegalArgumentException("Output:\nThrows Exception //неверный математический оператор");//исключаем неверные матоператоры
            }
            switch (op) {
                case "/":
                    result = a / b;
                    break;
                case "+": {
                    result = a + b;
                    break;
                }
                case "-": {
                    result = a - b;
                    break;
                }
                case "*": {
                    result = a * b;
                    break;
                }
            }
        return String.valueOf(result);
    }
}


