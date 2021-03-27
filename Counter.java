package curs.curs;

public class Counter {
    private static int counterObjects;

    public Counter() {

        counter();
    }

    public static int getCounterObjects() {

        return counterObjects;
    }

    private void counter() {

        counterObjects++;
    }
}
