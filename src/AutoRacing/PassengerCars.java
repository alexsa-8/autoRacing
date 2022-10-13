package AutoRacing;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class PassengerCars extends Transport implements Competing {
    double lapTime = getTime() * getCircleLength() / getMaxSpeed();

    public PassengerCars(String mark, String model, double engineVolume, double startMoving, double finishMovement,
                         int maxSpeed, int pitstop, String rubber) {
        super(mark, model, engineVolume, startMoving, finishMovement, maxSpeed, pitstop, rubber);
    }

    public void machineInformation() {
        System.out.print("Марка: " + getMark() + ", модель: " + getModel() + ", объём двигателя: " + getEngineVolume());
    }

    public double getLapTime() {
        return lapTime;
    }

    @Override
    public void passDiagnostics() {
        Calendar calendar = new GregorianCalendar();
        System.out.print(", диагностика: ");
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


    @Override
    public void startMoving() {
        System.out.print(", \nразгон 100 км/ч за " + getStartMoving() + " сек.");
    }

    @Override
    public void finishMovement() {
        System.out.println(", при скорости 100 км/ч останавливается за " + getFinishMovement() + " сек.");
    }

    @Override
    public void getPitStop() {
        System.out.println("Количество пит-стопов: " + getPitstop());
    }


    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга: " + getLapTime() + " минут.");
    }

    @Override
    public void getMaximumSpeed() {
        System.out.println("Максимальная скорость: " + getMaxSpeed() + " км/ч.");
    }
}
