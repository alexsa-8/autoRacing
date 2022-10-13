import AutoRacing.Buses;
import AutoRacing.PassengerCars;
import AutoRacing.Trucks;

public class Main {
    public static void main(String[] args) {
        PassengerCars mercedes = new PassengerCars("Мерседес", "M5", 3.0, 6,
                4, 150, 3, "зимняя");
        PassengerCars opel = new PassengerCars("Опель", "B10", 2.0, 7, 5,
                140, 3, "летняя");
        PassengerCars renault = new PassengerCars("Рено", "TL3", 1.5, 9, 6,
                130, 3, "зимняя");
        PassengerCars lada = new PassengerCars("Лада", "A12", 1.7, 8, 6,
                120, 3, "зимняя");
        Trucks mercedes1 = new Trucks("Мерседес", "C3", 3.0, 10, 7,
                140, 2, "летняя",3);
        Trucks opel1 = new Trucks("Опель", "U45", 3.1, 11, 8,
                130, 2,"летняя", 5);
        Trucks renault1 = new Trucks("Рено", "T25", 3.2, 12, 8,
                120, 2,"зимняя", 13);
        Trucks kamaz = new Trucks("Камаз", "A5", 3.5, 9, 6,
                130, 2,"зимняя", 8);

        Buses mercedes2 = new Buses("Мерседес", "DU1", 3.0, 15, 10,
                120, 1,"летняя", 35);
        Buses opel2 = new Buses("Opel", "L58", 3.2, 12, 8,
                125, 1,"летняя", 40);
        Buses renault2 = new Buses("Renault", "FZ1", 3.1, 13, 8,
                130, 1,"зимняя", 60);
        Buses liaz = new Buses("Лиаз", "A2", 2.9, 16, 10,
                110, 1,"зимняя", 25);



        mercedes.machineInformation();
        mercedes.passDiagnostics();
        mercedes.startMoving();
        mercedes.finishMovement();
        mercedes.getPitstop();
        mercedes.getBestLapTime();
        mercedes.getMaximumSpeed();
        opel.machineInformation();
        opel.passDiagnostics();
        opel.startMoving();
        opel.finishMovement();
        opel.getPitstop();
        opel.getBestLapTime();
        opel.getMaximumSpeed();
        renault.machineInformation();
        renault.passDiagnostics();
        renault.startMoving();
        renault.finishMovement();
        renault.getPitstop();
        renault.getBestLapTime();
        renault.getMaximumSpeed();
        lada.machineInformation();
        lada.passDiagnostics();
        lada.startMoving();
        lada.finishMovement();
        lada.getPitstop();
        lada.getBestLapTime();
        lada.getMaximumSpeed();
        mercedes1.machineInformation();
        mercedes1.passDiagnostics();
        mercedes1.startMoving();
        mercedes1.finishMovement();
        mercedes1.getPitstop();
        mercedes1.getBestLapTime();
        mercedes1.getMaximumSpeed();
        opel1.machineInformation();
        opel1.passDiagnostics();
        opel1.startMoving();
        opel1.finishMovement();
        opel1.getPitstop();
        opel1.getBestLapTime();
        opel1.getMaximumSpeed();
        renault1.machineInformation();
        renault1.passDiagnostics();
        renault1.startMoving();
        renault1.finishMovement();
        renault1.getPitstop();
        renault1.getBestLapTime();
        renault1.getMaximumSpeed();
        kamaz.machineInformation();
        kamaz.passDiagnostics();
        kamaz.startMoving();
        kamaz.finishMovement();
        kamaz.getPitstop();
        kamaz.getBestLapTime();
        kamaz.getMaximumSpeed();
        mercedes2.machineInformation();
        mercedes2.startMoving();
        mercedes2.finishMovement();
        mercedes2.getPitstop();
        mercedes2.getBestLapTime();
        mercedes2.getMaximumSpeed();
        mercedes2.passDiagnostics();
        opel2.machineInformation();
        opel2.startMoving();
        opel2.finishMovement();
        opel2.getPitstop();
        opel2.getBestLapTime();
        opel2.getMaximumSpeed();
        opel2.passDiagnostics();
        renault2.machineInformation();
        renault2.startMoving();
        renault2.finishMovement();
        renault2.getPitstop();
        renault2.getBestLapTime();
        renault2.getMaximumSpeed();
        renault2.passDiagnostics();
        liaz.machineInformation();
        liaz.startMoving();
        liaz.finishMovement();
        liaz.getPitstop();
        liaz.getBestLapTime();
        liaz.getMaximumSpeed();
        liaz.passDiagnostics();
        Driver<PassengerCars> alex=new DriverB("Alex","B",3,lada);
        Driver<Trucks> bob = new DriverC("Bob",null,5,kamaz);
        Driver<Buses> maks = new DriverD("Maks","D",4,liaz);
        alex.controlMachine();
        alex.getDriverLicenseCategory();
        bob.controlMachine();
        bob.getDriverLicenseCategory();
        maks.controlMachine();
        maks.getDriverLicenseCategory();
    }
}