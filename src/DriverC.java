public class DriverC extends Driver<Trucks> {

    public DriverC(String naimDriver, String driverLicenseCategory, int experience, Trucks car) {
        super(naimDriver, driverLicenseCategory, experience, car);
    }

    @Override
    protected String getNameSponsor() {
        return null;
    }
}
