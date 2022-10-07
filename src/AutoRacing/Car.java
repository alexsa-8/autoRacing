package AutoRacing;

import java.util.Objects;

public abstract class Car implements Competing {
    private static String mark;
    private final String model;
    private final double engineVolume;
    private static double startMoving;
    private static double finishMovement;
    private final int maxSpeed;
    private static int pitstop;

    public Car(String mark, String model, double engineVolume, double startMoving, double finishMovement, int maxSpeed,
               int pitstop) {
        this.mark = Objects.requireNonNullElse(mark, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.engineVolume = Objects.requireNonNullElse(engineVolume, 0.0);
        this.startMoving = Objects.requireNonNullElse(startMoving, 0.0);
        this.finishMovement = Objects.requireNonNullElse(finishMovement, 0.0);
        //this.circleLength = circleLength;
        this.maxSpeed = Objects.requireNonNullElse(maxSpeed, 0);
        this.pitstop = Objects.requireNonNullElse(pitstop, 0);
    }

    public abstract void startMoving();

    public abstract void finishMovement();

    public static String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public static double getStartMoving() {
        return startMoving;
    }

    public static double getFinishMovement() {
        return finishMovement;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getCircleLength() {
        return 5;
    }

    public int getTime() {
        return 60;
    }

    public static int getPitstop() {
        return pitstop;
    }
}
