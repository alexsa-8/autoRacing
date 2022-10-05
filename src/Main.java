import AutoRacing.Buses;
import AutoRacing.PassengerCars;
import AutoRacing.Trucks;

//import static AutoRacing.PassengerCars.BEST_LAP_TIME;

public class Main {
    public static void main(String[] args) {
        PassengerCars mercedes=new PassengerCars("Мерседес", "M5", 3.0, 6,
                8,150);
        PassengerCars opel=new PassengerCars("Опель", "B10", 2.0, 7, 9,
                140);
        PassengerCars renault=new PassengerCars("Рено", "TL3", 1.5, 9, 11,
                130);
        PassengerCars lada=new PassengerCars("Лада", "A12", 1.7, 8, 10,
                120);
        Trucks mercedes1=new Trucks("Мерседес", "C3", 3.0, 10, 12,140);
        Trucks opel1=new Trucks("Опель", "U45", 3.1, 11, 13,130);
        Trucks renault1=new Trucks("Рено", "T25", 3.2, 12, 14,120);
        Trucks kamaz=new Trucks("Камаз", "A5", 3.5, 9, 11,130);

        Buses mercedes2=new Buses("Мерседес", "DU1", 3.0, 15, 17,120);
        Buses opel2=new Buses("Мерседес", "L58", 3.2, 12, 14,125);
        Buses renault2=new Buses("Мерседес", "FZ1", 3.1, 13, 15,130);
        Buses liaz=new Buses("Лиаз", "A2", 2.9, 16, 16,110);


        mercedes.machineInformation();
        mercedes.startMoving();
        mercedes.finishMovement();
        mercedes.getPitStop();
        mercedes.getBestLapTime();
        mercedes.getMaximumSpeed();
        opel.machineInformation();
        opel.startMoving();
        opel.finishMovement();
        opel.getPitStop();
        opel.getBestLapTime();
        opel.getMaximumSpeed();
        renault.machineInformation();
        renault.startMoving();
        renault.finishMovement();
        renault.getPitStop();
        renault.getBestLapTime();
        renault.getMaximumSpeed();
        lada.machineInformation();
        lada.startMoving();
        lada.finishMovement();
        lada.getPitStop();
        lada.getBestLapTime();
        lada.getMaximumSpeed();
        mercedes1.machineInformation();
        mercedes1.startMoving();
        mercedes1.finishMovement();
        mercedes1.getPitStop();
        mercedes1.getBestLapTime();
        mercedes1.getMaximumSpeed();
        opel1.machineInformation();
        opel1.startMoving();
        opel1.finishMovement();
        opel1.getPitStop();
        opel1.getBestLapTime();
        opel1.getMaximumSpeed();
        renault1.machineInformation();
        renault1.startMoving();
        renault1.finishMovement();
        renault1.getPitStop();
        renault1.getBestLapTime();
        renault1.getMaximumSpeed();
        kamaz.machineInformation();
        kamaz.startMoving();
        kamaz.finishMovement();
        kamaz.getPitStop();
        kamaz.getBestLapTime();
        kamaz.getMaximumSpeed();
        mercedes2.machineInformation();
        mercedes2.startMoving();
        mercedes2.finishMovement();
        mercedes2.getPitStop();
        mercedes2.getBestLapTime();
        mercedes2.getMaximumSpeed();
        opel2.machineInformation();
        opel2.startMoving();
        opel2.finishMovement();
        opel2.getPitStop();
        opel2.getBestLapTime();
        opel2.getMaximumSpeed();
        renault2.machineInformation();
        renault2.startMoving();
        renault2.finishMovement();
        renault2.getPitStop();
        renault2.getBestLapTime();
        renault2.getMaximumSpeed();
        liaz.machineInformation();
        liaz.startMoving();
        liaz.finishMovement();
        liaz.getPitStop();
        liaz.getBestLapTime();
        liaz.getMaximumSpeed();
    }
}