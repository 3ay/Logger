package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomDateFormat {
    public String getCurrentDate()
    {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return now.format(formatter);
    }
}
