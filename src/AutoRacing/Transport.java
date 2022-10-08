package AutoRacing;
import java.util.Objects;

public abstract class Transport implements Competing {
    private final String mark;
    private final String model;
    private final double engineVolume;
    private final double startMoving;
    private final double finishMovement;
    private final int maxSpeed;
    private static int pitstop;

    public Transport(String mark, String model, double engineVolume, double startMoving, double finishMovement, int maxSpeed,
               int pitstop) {
        this.mark = Objects.requireNonNullElse(mark, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.engineVolume = Objects.requireNonNullElse(engineVolume, 0.0);
        this.startMoving = Objects.requireNonNullElse(startMoving, 0.0);
        this.finishMovement = Objects.requireNonNullElse(finishMovement, 0.0);
        this.maxSpeed = Objects.requireNonNullElse(maxSpeed, 0);
        this.pitstop = Objects.requireNonNullElse(pitstop, 0);
    }

    public abstract void startMoving();

    public abstract void finishMovement();

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public double getStartMoving() {
        return startMoving;
    }

    public double getFinishMovement() {
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

    public int getPitstop() {
        return pitstop;
    }
}
