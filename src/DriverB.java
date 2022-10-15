public class DriverB extends Driver<PassengerCars> {
    public DriverB(String naimDriver, String driverLicenseCategory, int experience, PassengerCars car) {
        super(naimDriver, driverLicenseCategory, experience, car);
    }

    @Override
    protected String getNameSponsor() {
        return null;
    }
}