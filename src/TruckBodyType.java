public enum TruckBodyType {
    N1(0.0, 3.5),
    N2(3.5,12.0),
    N3(12.0, 20.0),
    UNDEFINED(0.0,0.0);
private final double from;
private final double to;
    TruckBodyType(double from, double to) {
        this.from = from;
        this.to = to;
    }
    public TruckBodyType valueOf(double weight) {
        for (TruckBodyType type: TruckBodyType.values()){
            if (weight >= type.from && weight<= type.to){
                return type;
            }
        }
        return UNDEFINED;
    }
}
