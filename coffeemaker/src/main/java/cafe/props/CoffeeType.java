package cafe.props;

public enum CoffeeType {
    CAPPUCCINO(98),
    LATTE(99),
    ESPRESSO(100);

    private long idealCoffeeTemperature;

    CoffeeType(long idealCoffeeTemperature) {
        this.idealCoffeeTemperature = idealCoffeeTemperature;
    }

    public long getIdealCoffeeTemperature() {
        return idealCoffeeTemperature;
    }
}
