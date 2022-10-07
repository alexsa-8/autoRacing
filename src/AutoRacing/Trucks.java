package AutoRacing;

public class Trucks extends Car implements Competing{
    double lapTime = getTime() * getCircleLength() / getMaxSpeed();

    public Trucks(String mark, String model, double engineVolume, double startMoving, double finishMovement,
                  int maxSpeed, int pitstop) {
        super(mark, model, engineVolume, startMoving, finishMovement, maxSpeed, pitstop);
    }

    public void machineInformation() {
        System.out.print("Марка: " + getMark() + ", модель: " + getModel() + ", объём двигателя: " + getEngineVolume());
    }

    public double getLapTime() {
        return lapTime;
    }

    @Override
    public void startMoving() {
        System.out.print(", разгон 100 км/ч за " + getStartMoving() + " сек.");
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
        System.out.println("Максимальная скорость: " + getMaxSpeed() + " км/ч");
    }
}
