package org.example;

public class Logger {
    protected int num = 1;
    private static Logger logger = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        CustomDateFormat dateFormat = new CustomDateFormat();
        System.out.println("[" + dateFormat.getCurrentDate() + " " + num++ + "] " + msg);
    }
}
