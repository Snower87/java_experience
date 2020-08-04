package ru.begletsov.time_exec;

/**
 * Класс TimeExec время выполнения Java-кода
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 03.08.2020
 * @version 1
 */

public class TimeExec {
    private long startTime;
    private long endTime  ;
    private long timeExec ;

    public TimeExec() {
        this.startTime = 0;
        this.endTime = 0;
        this.timeExec = 0;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public long end() {
        return startTime - System.currentTimeMillis();
    }

    public void clear() {
        this.startTime = 0;
        this.endTime = 0;
        this.timeExec = 0;
    }

    public long getTimeExec() {
        return timeExec;
    }
}
