package com.seksimus.basicjava.module4;

import java.util.logging.*;

public class Task4 {

    public static void main(String[] args) {

        configureLogging();

    }

    private static void configureLogging() {
        Logger loggerA = Logger.getLogger("org.stepic.java.loggining.ClassA");
        loggerA.setLevel(Level.ALL);

        Logger loggerB = Logger.getLogger("org.stepic.java.loggining.ClassB");
        loggerB.setLevel(Level.WARNING);

        Logger javaLogger = Logger.getLogger("org.stepic.java");
        javaLogger.setLevel(Level.ALL);
        javaLogger.setUseParentHandlers(false);

        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new XMLFormatter());

        javaLogger.addHandler(consoleHandler);
    }
}
