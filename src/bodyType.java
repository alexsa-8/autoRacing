public enum bodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COMPARTMENT("Купе"),
    STATION_WAGON("Универсал"),
    JEEP("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");
    private final String bodyType;

    bodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }
}
