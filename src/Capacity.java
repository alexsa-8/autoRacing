public enum Capacity {
    ESPECIALLY_SMALL(0, 10),
    SMALL(10, 30),
    AVERAGE(30, 60),
    BIG(60, 90),
    ESPECIALLY_BIG(90, 120),
    UNDEFINED(0,0);
    private final int from;
    private final int to;

    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }
    public Capacity quantity(int quantity) {
        for (Capacity type: Capacity.values()){
            if (quantity >= type.from && quantity<= type.to){
                return type;
            }
        }
        return UNDEFINED;
    }
}
