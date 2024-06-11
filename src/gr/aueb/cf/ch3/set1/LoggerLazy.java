package gr.aueb.cf.ch3.set1;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerLazy {
    private static LoggerLazy INSTANCE = null;

    private LoggerLazy() {

    }

    public static LoggerLazy getInstance() {
        if (INSTANCE == null) INSTANCE= new LoggerLazy();
        return INSTANCE;
    }

    public void logMessage() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd, hh:mm:ss");
        String formattedTimestamp = LocalDateTime.now().format(formatter);

        System.out.println("Hello World from lazy singleton at: " + formattedTimestamp);
    }
}
