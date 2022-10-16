import java.util.Objects;

public class Mechanic <T extends Transport> extends Driver<Transport> {
    private static String nameMechanics;
    private final String surNameMechanics;
    private final String companyMechanics;
    private final String specificityMechanics;

    public Mechanic(String nameMechanics, String surNameMechanics, String companyMechanics, String specificityMechanics) {
        this.nameMechanics = Objects.requireNonNullElse(nameMechanics, "default");
        this.surNameMechanics = Objects.requireNonNullElse(surNameMechanics, "default");
        this.companyMechanics = Objects.requireNonNullElse(companyMechanics, "default");
        this.specificityMechanics = Objects.requireNonNullElse(specificityMechanics, "default");
    }

    public boolean performMaintenance(){
        System.out.println("Механник "+nameMechanics+" проводит техобслуживание "+specificityMechanics);
        return false;
    }
    public void fixCar(){
        System.out.println("Механник "+nameMechanics+" чинит "+specificityMechanics);
    }

    public static String getNameMechanics() {
        return nameMechanics;
    }

    public String getSurNameMechanics() {
        return surNameMechanics;
    }

    public String getCompanyMechanics() {
        return companyMechanics;
    }

    public String getSpecificityMechanics() {
        return specificityMechanics;
    }

    @Override
    protected String getNameSponsor() {
        return null;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "surNameMechanics='" + surNameMechanics + '\'' +
                ", companyMechanics='" + companyMechanics + '\'' +
                ", specificityMechanics='" + specificityMechanics + '\'' +
                "} " + super.toString();
    }
}
