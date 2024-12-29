import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создаём объект scanner
        System.out.println("Input:");
        String input = scanner.nextLine(); // читаем строку с нашими переменными и матзнаком (в образце через пробелы)
        String result = Calculate.calc(input); //метод calc в классе Calculate
        System.out.println("Output:\n" + result); // Выводим результат в консоль
        scanner.close(); // Закрываем поток сканнера
    }
}




