import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport implements Competing {
    private final String mark;
    private final String model;
    private final double engineVolume;
    private final double startMoving;
    private final double finishMovement;
    private final int maxSpeed;
    private static int pitstop;
    String rubber;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor<?>> sponsors = new ArrayList<>();

    public Transport(String mark, String model, double engineVolume, double startMoving, double finishMovement,
                     int maxSpeed, int pitstop, String rubber) {
        this.mark = Objects.requireNonNullElse(mark, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.engineVolume = Objects.requireNonNullElse(engineVolume, 0.0);
        this.startMoving = Objects.requireNonNullElse(startMoving, 0.0);
        this.finishMovement = Objects.requireNonNullElse(finishMovement, 0.0);
        this.maxSpeed = Objects.requireNonNullElse(maxSpeed, 0);
        this.pitstop = Objects.requireNonNullElse(pitstop, 0);
        this.rubber = Objects.requireNonNullElse(rubber,"default");
    }

    public abstract void passDiagnostics();
    public abstract void startMoving();

    public abstract void finishMovement();
    public void addDriver(Driver<?> driver){
        drivers.add(driver);
    }
    public void addMechanic(Mechanic<?> mechanic){
        drivers.add(mechanic);
    }
    public void addSponsor(Sponsor<?> sponsor){
        drivers.add(sponsor);
    }

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

    public abstract List<Driver<?>> getDrivers();

    public List<Mechanic<?>> getMechanics() {
        return null;
    }

    public List<Sponsor<?>> getSponsors() {
        return null;
    }
}
