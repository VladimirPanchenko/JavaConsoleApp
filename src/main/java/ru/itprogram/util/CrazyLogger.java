package ru.itprogram.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CrazyLogger {
    private final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd-mm-yyyy : hh-mm - ");
    private final String LOG_IS_EMPTY = "Журнал пуст";
    private final String LOG_MESSAGE_DOES_NOT_MEET = "Сообщение не встречается";
    private final String TRANSITION_TO_A_NEW_LINE = "\n";
    private StringBuilder log;
    private LocalDateTime localDateTime;
    private static CrazyLogger instance;

    private CrazyLogger() {
        log = new StringBuilder();
    }

    public static CrazyLogger getInstance() {
        if (instance == null) {
            instance = new CrazyLogger();
        }
        return instance;
    }

    public StringBuilder getLog() {
        return log;
    }

    public void addLogMessage(String message) {
        localDateTime = LocalDateTime.now();
        log.append(localDateTime.format(FORMAT));
        log.append(message);
        log.append(TRANSITION_TO_A_NEW_LINE);
    }

    public void printLogMessage() {
        if (logIsEmpty()) {
            System.out.println(LOG_IS_EMPTY);
        } else {
            System.out.println(log);
        }
    }

    public void printLogMessageWithTextPresence(String textPresence) {
        if (logIsEmpty()) {
            System.out.println(LOG_IS_EMPTY);
        } else {
            if (log.toString().contains(textPresence)) {
                for (String s : log.toString().split(TRANSITION_TO_A_NEW_LINE)) {
                    if (s.contains(textPresence)) {
                        System.out.println(s);
                    }
                }
            } else {
                System.out.println(LOG_MESSAGE_DOES_NOT_MEET);
            }
        }
    }

    private boolean logIsEmpty() {
        return log.toString().isEmpty();
    }
}
