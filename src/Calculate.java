
class Calculate {
    static String calc(String input) {
        String[] calcs = input.split(" "); // создаём массив calcs из разделенных по пробелу символов строки
        //System.out.println(Arrays.toString(calcs));// выводим в консоль calcs
        if (calcs.length != 3) {
            throw new IllegalArgumentException("Формат математической операции не удовлетворяет " +
                    "заданию - два операнда и один оператор (+, -, /, *)");
            // исключаем более 3х символов не считая пробелы в строке
        }
        int[] numbers = new int[2]; //создаём массив numbers на 2 переменные
        try {
            numbers[0] = Integer.parseInt(calcs[0]); // первому элементу присваиваем значение Int первой переменной
            numbers[1] = Integer.parseInt(calcs[2]); // второму элементу присваиваем значение Int второй переменной
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Числа должны быть целыми");//исключение если не тот тип переменных
        }
        //System.out.println(Arrays.toString(numbers)); // выводим в консоль массив с переменными

        int result = 0;
        int a = numbers[0];
        //System.out.println("a = " + a);
        if (a<1||a>10){
            throw new IllegalArgumentException("Число вне диапазона от 1 до 10");//исключение
        }
        String op = calcs[1];
        //System.out.println("op = " + op);
        int b = numbers[1];
        //System.out.println("b = " + b);
        if (b<1||b>10){
            throw new IllegalArgumentException("Число вне диапазона от 1 до 10");//исключение
        }
        String ops = "+-*/";
        if (!ops.contains(op)) {
            throw new IllegalArgumentException("Неверный математический оператор");//исключаем неверные матоператоры
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
