import AutoRacing.Car;

public class DriverC extends Driver<Car> {
    public DriverC(String naimDriver, String driverLicenseCategory, int experience) {
        super(naimDriver, driverLicenseCategory, experience);
    }

    @Override
    public void controlMachine(Car Car) {
        System.out.println("Водитель "+getNaimDriver()+" управляет автомобилем "+Car.getMark()+" и будет участвовать в заезде");
    }

    @Override
    public void startMoving(Car Car) {
        System.out.println("Стартует 100 км/ч за " + Car.getStartMoving() + " сек.");
    }

    @Override
    public void stop(Car Car) {
        System.out.println("Останавлисается при скорости 100 км/ч за " + Car.getFinishMovement() + " сек.");
    }

    @Override
    public void refuelCar(Car Car) {
        System.out.println("Заправляет авто "+Car.getPitstop()+" раз.");
    }
}
