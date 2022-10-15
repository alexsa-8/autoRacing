import java.util.List;

public class Buses extends Transport implements Competing {
    public final int numberOfPassengers;
    double lapTime = getTime() * getCircleLength() / getMaxSpeed();

    public double getLapTime() {
        return lapTime;
    }

    public Buses(String mark, String model, double engineVolume, double startMoving, double finishMovement,
                 int maxSpeed, int pitstop, String rubber, int numberOfPassengers) {
        super(mark, model, engineVolume, startMoving, finishMovement, maxSpeed, pitstop, rubber);
        this.numberOfPassengers = numberOfPassengers;
    }

    public void machineInformation() {
        System.out.println("Марка: " + getMark() + ", модель: " + getModel() + ", объём двигателя: "
                + getEngineVolume() + ", количество пассажиров: " + getNumberOfPassengers()+",");
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автобус " + getMark() + " диагностика не требуется.");

    }

    @Override
    public void startMoving() {
        System.out.print("разгон 100 км/ч за " + getStartMoving() + " сек.");
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
        System.out.println("Лучшее время круга: " + getLapTime() + " минут.");
    }

    @Override
    public void getMaximumSpeed() {
        System.out.println("Максимальная скорость: " + getMaxSpeed() + " км/ч.");
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}
