package ru.mirea.sirukaa;

import java.util.regex.Pattern;

public class Task5 {
    public String[] answer(String text, String delimiter) {
        // Pattern.quote - разделитель трактуется как обычный символ, limit -1 - пустые части не отбрасываются
        return text.split(Pattern.quote(delimiter), -1);
    }
}
