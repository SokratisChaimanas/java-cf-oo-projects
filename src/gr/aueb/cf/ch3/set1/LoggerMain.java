package gr.aueb.cf.ch3.set1;

public class LoggerMain {

    public static void main(String[] args) {
        LoggerEager eagerSingleton = LoggerEager.getInstance();
        LoggerLazy lazySingleton = LoggerLazy.getInstance();

        eagerSingleton.logMessage();
        lazySingleton.logMessage();
    }


}
