public class DriverD extends Driver<Buses> {

    public DriverD(String naimDriver, String driverLicenseCategory, int experience, Buses car) {
        super(naimDriver, driverLicenseCategory, experience, car);
    }

    @Override
    protected String getNameSponsor() {
        return null;
    }
}
