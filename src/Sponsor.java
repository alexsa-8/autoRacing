public class Sponsor <T extends Transport> extends Driver<Transport> {
    private static String nameSponsor;
    private double amountSupport;

    public Sponsor(String nameSponsor, double amountSupport) {
        this.nameSponsor = nameSponsor;
        this.amountSupport = amountSupport;
    }

    public void sponsorRace() {
        System.out.println("Компания " + nameSponsor + " спонсирует заезд на " + amountSupport + " руб.");
    }

    public String getNameSponsor() {
        return nameSponsor;
    }

    public double getAmountSupport() {
        return amountSupport;
    }

    public void setAmountSupport(double amountSupport) {
        this.amountSupport = amountSupport;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "amountSupport=" + amountSupport +
                ", experience=" + experience +
                "} " + super.toString();
    }
}
