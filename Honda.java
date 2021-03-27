package curs.curs.Cars;

public class Honda extends Car {
    private boolean isEngineStarted;
    private int speed;

    public void printSpeed() {

        System.out.println("Current speed is " + speed + " km/h");
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    @Override
    public void setName(String name) {

        this.name = name;
    }

    @Override
    public void startEngine() {
        if (!isEngineStarted) {
            isEngineStarted = true;
            System.out.println("Engine is started successfully.");
        } else {
            System.out.println("Engine is already started.");
        }
    }

    @Override
    public void run() {
        if (isEngineStarted) {
            System.out.println("Car is ready to driving!");
        } else {
            System.out.println("Firstly, you should start engine!");
        }
    }

    @Override
    public void stopEngine() {
        if (isEngineStarted) {
            isEngineStarted = false;
            speed = 0;
            System.out.println("Engine is stopped successfully. Car speed is " + speed + " km/h");
        } else {
            System.out.println("Engine is already stopped");
        }
    }
}
