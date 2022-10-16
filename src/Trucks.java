import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;

public class Trucks extends Transport implements Competing {
    private final double tonnage;
    double lapTime = getTime() * getCircleLength() / getMaxSpeed();

    public Trucks(String mark, String model, double engineVolume, double startMoving, double finishMovement,
                  int maxSpeed, int pitstop, String rubber, double tonnage) {
        super(mark, model, engineVolume, startMoving, finishMovement, maxSpeed, pitstop, rubber);
        this.tonnage = tonnage;
    }

    public void machineInformation() {
        System.out.println("Марка: " + getMark() + ", модель: " + getModel() + ", объём двигателя: "
                + getEngineVolume() + ", грузоподъёмность: " + getTonnage() + " т.");
    }

    @Override
    public void passDiagnostics() {
        Calendar calendar = new GregorianCalendar();
        System.out.print("Диагностика: ");
        try {
            if ((Objects.equals(rubber, "зимняя") && calendar.get(Calendar.MONTH) < 3 && calendar.get(Calendar.MONTH) > 10)
                    ||(Objects.equals(rubber, "летняя") && calendar.get(Calendar.MONTH) >= 3 && calendar.get(Calendar.MONTH) <= 10)) {
                System.out.print("всё в порядке");
            }
        } catch (Exception e) {
            System.out.print("пройти диагностику");
            throw new RuntimeException(e);
        }

    }

    public double getLapTime() {
        return lapTime;
    }

    @Override
    public void startMoving() {
        System.out.print("Разгон 100 км/ч за " + getStartMoving() + " сек.");
    }

    @Override
    public void finishMovement() {
        System.out.println(", при скорости 100 км/ч останавливается за " + getFinishMovement() + " сек.");
    }

    @Override
    public List<Driver<?>> getDrivers() {
        return null;
    }

    @Override
    public void getPitStop() {
        System.out.println("Количество пит-стопов: " + getPitstop());
    }


    @Override
    public void getBestLapTime() {
        System.out.print("Лучшее время круга: " + getLapTime() + " минут.");
    }

    @Override
    public void getMaximumSpeed() {
        System.out.println(" Максимальная скорость: " + getMaxSpeed() + " км/ч.");
    }

    public double getTonnage() {
        return tonnage;
    }
}
