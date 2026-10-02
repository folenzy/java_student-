package ru.mirea.sirukaa;

import java.util.Random;

public class Task2 {
    public int[] answer(int size) {
        Random random = new Random();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = random.nextInt(201) - 100; // от -100 до 100 включительно
        }
        return result;
    }
}
