package main.java.TimeOperations;

import java.util.concurrent.TimeUnit;

public class TimeActions {

    public long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public int calculateDifferenceInHours(long firstTime, long secondTime) {
        long difference;
        if (firstTime > secondTime) {
            difference = firstTime - secondTime;
        }
        else {
            difference = secondTime - firstTime;
        }
        return (int) TimeUnit.MILLISECONDS.toHours(difference);
    }
}