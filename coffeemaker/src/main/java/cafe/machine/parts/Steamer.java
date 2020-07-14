package cafe.machine.parts;

import cafe.Coffee;

public class Steamer {

    private static final long DEFAULT_HOT_COFFEE_TEMPERATURE_IN_C = 110;

    private Long hotCoffeeTemperature = DEFAULT_HOT_COFFEE_TEMPERATURE_IN_C;

    public Coffee steam(Coffee coffee) {
        Long temperature = coffee.getTemperature();
        coffee.setTemperature(hotCoffeeTemperature);
        return coffee;
    }

    public Long getHotCoffeeTemperature() {
        return hotCoffeeTemperature;
    }

    public Steamer setHotCoffeeTemperature(Long hotCoffeeTemperature) {
        this.hotCoffeeTemperature = hotCoffeeTemperature;
        return this;
    }
}
