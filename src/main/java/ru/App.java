package ru.mirea.sirukaa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Задание 1
        System.out.println("Задание 1. Введите строку:");
        String text = input.nextLine();
        System.out.println(new Task1().answer(text));

        // Задание 2
        System.out.println("Задание 2. Введите размер массива:");
        int size = Integer.parseInt(input.nextLine().trim());
        System.out.println(Arrays.toString(new Task2().answer(size)));

        // Задание 3
        System.out.println("Задание 3. Введите идентификатор уровня (1-30):");
        int level = Integer.parseInt(input.nextLine().trim());
        System.out.println(new Task3().answer(level));

        // Задание 4
        System.out.println("Задание 4. Введите длину массивов:");
        int n = Integer.parseInt(input.nextLine().trim());
        int[] first = new int[n];
        int[] second = new int[n];
        for (int i = 0; i < n; i++) {
            first[i] = 10 + random.nextInt(91); // от 10 до 100
            second[i] = 10 + random.nextInt(91);
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(new Task4().answer(first, second));

        // Задание 5
        System.out.println("Задание 5. Введите строку:");
        String line = input.nextLine();
        System.out.println("Введите разделитель:");
        String delimiter = input.nextLine();
        System.out.println(Arrays.toString(new Task5().answer(line, delimiter)));
    }
}
