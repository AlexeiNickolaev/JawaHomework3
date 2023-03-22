package task1;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
// (в языке уже есть что-то готовое для этого)

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(12);
        numbers.add(33);
        numbers.add(24);
        numbers.add(15);
        numbers.add(4);
        numbers.add(51);

        System.out.println("Список: " + numbers);

        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("Список без четных чисел: " + numbers);

    }
}
