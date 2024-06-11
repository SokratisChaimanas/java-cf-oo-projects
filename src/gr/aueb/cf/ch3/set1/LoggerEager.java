package gr.aueb.cf.ch3.set1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerEager {
    private static final LoggerEager INSTANCE = new LoggerEager();

    private LoggerEager() {

    }

    public static LoggerEager getInstance() {
        return INSTANCE;
    }

    public void logMessage() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd, hh:mm:ss");
        String formattedTimestamp = LocalDateTime.now().format(formatter);
        System.out.println("Hello World from eager singleton at : "+ formattedTimestamp);
    }
}
