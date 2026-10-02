package ru.mirea.sirukaa;

public class Task4 {
    public int answer(int[] first, int[] second) {
        int max = first[0];
        for (int value : first) {
            if (value > max) {
                max = value;
            }
        }
        for (int value : second) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
