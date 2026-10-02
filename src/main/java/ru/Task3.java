package ru.mirea.sirukaa;

public class Task3 {
    // Отсортированный массив из 15 идентификаторов уровней (числа от 1 до 30)
    private final int[] levels = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};

    // Бинарный поиск: минимальное число шагов
    public int answer(int level) {
        int left = 0;
        int right = levels.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (levels[mid] == level) {
                return mid;
            } else if (levels[mid] < level) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
