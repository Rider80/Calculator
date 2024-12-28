import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NumberFormatException{
        Scanner scanner = new Scanner(System.in); // создаём объект scanner
        System.out.println("Input:");
        String line = scanner.nextLine(); // читаем строку с нашими переменными и матзнаком (в образце через пробелы)
        String[] calcs = line.split(" "); // создаём массив calcs из разделенных по пробелу символов строки
        //System.out.println(Arrays.toString(calcs));// выводим в консоль calcs
        if (calcs.length != 3) {
            System.out.println("Output:\nThrows Exception //т.к. формат математической операции не удовлетворяет " +
                    "заданию - два операнда и один оператор (+, -, /, *)");
            // исключаем более 3х символов не считая пробелы в строке
            return; // остановка
        }
        int[] numbers = new int[2]; //создаём массив numbers на 2 переменные
        try {
            numbers[0] = Integer.parseInt(calcs[0]); // первому элементу присваиваем значение Int первой переменной
            numbers[1] = Integer.parseInt(calcs[2]); // второму элементу присваиваем значение Int второй переменной
        } catch (Exception ex) {
        System.out.println("Output:\nThrows Exception //неверный тип переменных");//исключение если не тот тип переменных
        return;//остановка
        }
        //System.out.println(Arrays.toString(numbers)); // выводим в консоль массив с переменными
         scanner.close(); // закрываем поток сканнера

        try { // если не выйдет то что в трай, то кэтч
            int result = 0;
            int a = numbers[0];
            //System.out.println("a = " + a);
            if (a<1||a>10){
                System.out.println("Output:\nThrows Exception //Переменная вне диапазона от 1 до 10");//исключение
                return;
            }
            String op = calcs[1];
            //System.out.println("op = " + op);
            int b = numbers[1];
            //System.out.println("b = " + b);
            if (b<1||b>10){
                System.out.println("Output:\nThrows Exception //Переменная вне диапазона от 1 до 10");//исключение
                return;
            }
            String ops = "+-*/";
            if (!ops.contains(op)) {
                System.out.println("Output:\nThrows Exception //неверный математический оператор");//исключаем неверные матоператоры
                return;
            }
            switch (op) {
                case "/":
                    System.out.println(b == 0 ? "Output:\nThrows Exception //деление на ноль" : "Output:\n"+ a / b);//исключаем деление на ноль
                    break;
                case "+": {
                    result = a + b;
                    System.out.println("Output:\n"+result);
                    break;
                }
                case "-": {
                    result = a - b;
                    System.out.println("Output:\n"+result);
                    break;
                }
                case "*": {
                    result = a * b;
                    System.out.println("Output:\n"+result);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Output:\nThrows Exception");
        }
    }
}

