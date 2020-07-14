package cafe;

import cafe.props.CoffeeType;
import cafe.props.Size;

public class Coffee {

    private CoffeeType coffeeType;
    private Size size;
    private Long temperature;

    public Coffee(CoffeeType coffeeType, Size size) {
        this.coffeeType = coffeeType;
        this.size = size;
        this.temperature = coffeeType.getIdealCoffeeTemperature();
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public Size getSize() {
        return size;
    }

    public Long getTemperature() {
        return temperature;
    }

    public Coffee setTemperature(Long temperature) {
        this.temperature = temperature;
        return this;
    }
}
