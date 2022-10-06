import AutoRacing.Car;
import AutoRacing.Competing;
import java.util.Objects;

public class Driver <A extends Car & Competing> {
    private final String naimDriver;
    private final String driverLicenseCategory;
    int experience;

    public Driver(String naimDriver, String driverLicenseCategory, int experience) {
        this.naimDriver = Objects.requireNonNullElse(naimDriver, "default");
        this.driverLicenseCategory = Objects.requireNonNullElse(driverLicenseCategory, "default");
        this.experience = Objects.requireNonNullElse(experience, 0);
    }
    public void controlMachine (A Car){
        System.out.println("Водитель "+naimDriver+" управляет автомобилем "+Car.getMark()+" и будет участвовать в заезде");
    }
    public void startMoving(A Car){
        System.out.println("Стартует 100 км/ч за " + Car.getStartMoving() + " сек.");

    }
    public void stop(A Car){
        System.out.println("Останавлисается при скорости 100 км/ч за " + Car.getFinishMovement() + " сек.");

    }
    public void refuelCar(A Car){
        System.out.println("Заправляет авто "+Car.getPitstop()+" раз.");

    }

    public String getNaimDriver() {
        return naimDriver;
    }

    public String getDriverLicenseCategory() {
        return driverLicenseCategory;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
