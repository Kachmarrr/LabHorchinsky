import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> divisibleBy5 = new ArrayList<>();

        // Задайте свій масив чисел
        int[] inputArray = {135, 250, 333, 420, 555, 678, 745, 810, 965, 102, 246, 333, 500, 625, 777, 888, 999, 111, 234, 321};

        // Додаємо числа з масиву в список "numbers"
        for (int number : inputArray) {
            numbers.add(number);
        }

        // Перевіряємо кожне число в масиві "numbers" і, якщо воно ділиться на 5, додаємо його до масиву "divisibleBy5"
        for (int number : numbers) {
            if (number % 5 == 0) {
                if (number % 2 == 1){
                    divisibleBy5.add(number);
                }
            }
        }

        // Виводимо результати
        System.out.println("Усі числа:");
        System.out.println(numbers);
        System.out.println("Числа, які закінчується 5:");
        System.out.println(divisibleBy5);
    }
}
