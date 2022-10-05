package AutoRacing;

public class PassengerCars extends Car implements Competing {
    int pitStop = 2;
//    private static double ONE_LAP_TIME;
//    private static double TWO_LAP_TIME;
//    private static double THEE_LAP_TIME;
//    private static double FOUR_LAP_TIME;
//    private static double FIVE_LAP_TIME;
//    private static double SIX_LAP_TIME;
//
//    private static double SPEED_ONE_LAP;
//    private static double SPEED_TWO_LAP;
//    private static double SPEED_THEE_LAP;
//    private static double SPEED_FOUR_LAP;
//    private static double SPEED_FIVE_LAP;
//    private static double SPEED_SIX_LAP;
//    private double circleLength = 5;
//    private boolean[] getBEST_LAP_TIME;
//
//    public PassengerCars(String mark, String model, double engineVolume, double startMoving, double finishMovement,
//                         double ONE_LAP_TIME, double TWO_LAP_TIME, double THEE_LAP_TIME, double FOUR_LAP_TIME,
//                         double FIVE_LAP_TIME, double SIX_LAP_TIME, double SPEED_ONE_LAP, double SPEED_TWO_LAP,
//                         double SPEED_THEE_LAP, double SPEED_FOUR_LAP, double SPEED_FIVE_LAP, double SPEED_SIX_LAP) {
//        super(mark, model, engineVolume, startMoving, finishMovement);
//        this.ONE_LAP_TIME = ONE_LAP_TIME;
//        this.TWO_LAP_TIME = TWO_LAP_TIME;
//        this.THEE_LAP_TIME = THEE_LAP_TIME;
//        this.FOUR_LAP_TIME = FOUR_LAP_TIME;
//        this.FIVE_LAP_TIME = FIVE_LAP_TIME;
//        this.SIX_LAP_TIME = SIX_LAP_TIME;
//        this.SPEED_ONE_LAP = SPEED_ONE_LAP;
//        this.SPEED_TWO_LAP = SPEED_TWO_LAP;
//        this.SPEED_THEE_LAP = SPEED_THEE_LAP;
//        this.SPEED_FOUR_LAP = SPEED_FOUR_LAP;
//        this.SPEED_FIVE_LAP = SPEED_FIVE_LAP;
//        this.SPEED_SIX_LAP = SPEED_SIX_LAP;
//        this.BEST_LAP_TIME = BEST_LAP_TIME;
//        this.MAXIMUM_SPEED = MAXIMUM_SPEED;

    double lapTime = getTime() * getCircleLength() / getMaxSpeed();

    public PassengerCars(String mark, String model, double engineVolume, double startMoving, double finishMovement, int maxSpeed) {
        super(mark, model, engineVolume, startMoving, finishMovement, maxSpeed);
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
        System.out.println("Количество пит-стопов: " + pitStop);
    }


    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга: " + getLapTime() + " минут");
    }

    @Override
    public void getMaximumSpeed() {
        System.out.println("Максимальная скорость: " + getMaxSpeed() + " км/ч");
    }
}
