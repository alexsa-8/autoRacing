import AutoRacing.Competing;
import AutoRacing.Transport;

public abstract class Driver<T extends Transport & Competing> {
    private final String naimDriver;
    private final String driverLicenseCategory;
    int experience;
    private final T car;

    public Driver(String naimDriver, String driverLicenseCategory, int experience, T car) {
        this.naimDriver = naimDriver;
        this.driverLicenseCategory = driverLicenseCategory;
        this.experience = experience;
        this.car = car;
    }

    public void controlMachine() {
        System.out.println("Водитель " + getNaimDriver() + " управляет автомобилем "
                + car.getMark() + " и будет участвовать в заезде.");
    }

    public void startMoving() {
        System.out.println("Стартует " + car.getMark() + " " + car.getModel());
    }

    public void stop() {
        System.out.println("Останавлисается " + car.getMark() + " " + car.getModel());
    }

    public void refuelCar() {
        System.out.println("Заправляет авто " + car.getMark() + " " + car.getModel());
    }

    public String getNaimDriver() {
        return naimDriver;
    }

    public void getDriverLicenseCategory() {
        System.out.print("Водитель " + naimDriver);
        try {
            if (driverLicenseCategory != null || driverLicenseCategory.length()!=0 || driverLicenseCategory.length()<2) {
                System.out.println(" у вас права катигории: " + driverLicenseCategory);
            }
        } catch (Exception e) {
            System.out.println(" вам необходимо указать тип прав!");
            throw new RuntimeException(e);
        }

    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
