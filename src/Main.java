import java.util.List;

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
                140, 2, "летняя", 3);
        Trucks opel1 = new Trucks("Опель", "U45", 3.1, 11, 8,
                130, 2, "летняя", 5);
        Trucks renault1 = new Trucks("Рено", "T25", 3.2, 12, 8,
                120, 2, "зимняя", 13);
        Trucks kamaz = new Trucks("Камаз", "A5", 3.5, 9, 6,
                130, 2, "зимняя", 8);

        Buses mercedes2 = new Buses("Мерседес", "DU1", 3.0, 15, 10,
                120, 1, "летняя", 35);
        Buses opel2 = new Buses("Opel", "L58", 3.2, 12, 8,
                125, 1, "летняя", 40);
        Buses renault2 = new Buses("Renault", "FZ1", 3.1, 13, 8,
                130, 1, "зимняя", 60);
        Buses liaz = new Buses("Лиаз", "A2", 2.9, 16, 10,
                110, 1, "зимняя", 25);

        lada.machineInformation();
        lada.passDiagnostics();
        lada.startMoving();
        lada.finishMovement();
        lada.getPitstop();
        lada.getBestLapTime();
        lada.getMaximumSpeed();
        kamaz.machineInformation();
        kamaz.passDiagnostics();
        kamaz.startMoving();
        kamaz.finishMovement();
        kamaz.getPitstop();
        kamaz.getBestLapTime();
        kamaz.getMaximumSpeed();
        liaz.machineInformation();
        liaz.startMoving();
        liaz.finishMovement();
        liaz.getPitstop();
        liaz.getBestLapTime();
        liaz.getMaximumSpeed();
        liaz.passDiagnostics();
        Driver<PassengerCars> alex = new DriverB("Alex", "B", 3, lada);
        Driver<PassengerCars> alexei = new DriverB("Alexei", "B", 5, lada);
        Driver<Trucks> bob = new DriverC("Bob", "C", 5, kamaz);
        Driver<Trucks> dima = new DriverC("Dima", "C", 4, kamaz);
        Driver<Buses> maks = new DriverD("Maks", "D", 4, liaz);
        Driver<Buses> makar = new DriverD("Makar", "D", 6, liaz);
        alex.controlMachine();
        alex.getDriverLicenseCategory();
        bob.controlMachine();
        bob.getDriverLicenseCategory();
        maks.controlMachine();
        maks.getDriverLicenseCategory();

        Mechanic PassengerCar=new Mechanic("Михаил","Иванов",
                "ВАЗ","легковой автомабиль");
        Mechanic Truck=new Mechanic("Павел","Карасёв",
                "Камаз","грузовой автомабиль");
        Mechanic Bus=new Mechanic("Илья","Плотников",
                "ВАЗ","автобус");

        Sponsor iceberg=new Sponsor("Айсберг", 5000.0);
        Sponsor oak=new Sponsor("Дуб", 6000.0);
        Sponsor sun=new Sponsor("Солнце", 7000.0);

        lada.addSponsor(iceberg);
        kamaz.addSponsor(oak);
        liaz.addSponsor(sun);

        lada.addDriver(alex);
        kamaz.addDriver(bob);
        liaz.addDriver(maks);

        List<Driver<?>> drivers = lada.getDrivers();
        for (Driver<?> driver : drivers) {
            System.out.println(driver);
        }
        List<Mechanic<?>> mechanics = lada.getMechanics();
        for (Mechanic<?> mechanic : mechanics) {
            System.out.println(mechanic);
        }
        List<Sponsor<?>> sponsors = lada.getSponsors();
        for (Sponsor<?> sponsor : sponsors) {
            System.out.println(sponsor);
        }


    }
}