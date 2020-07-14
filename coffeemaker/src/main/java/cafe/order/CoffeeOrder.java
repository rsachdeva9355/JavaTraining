package cafe.order;

import cafe.props.CoffeeType;
import cafe.props.Size;

public class CoffeeOrder {

    private static final Size DEFAULT_COFFEE_SIZE = Size.MEDIUM;

    private String customerId;

    private CoffeeType coffeeType;
    private Size size = DEFAULT_COFFEE_SIZE;
    private boolean steamIt = false;

    public CoffeeOrder(String customerId, CoffeeType coffeeType) {
        this.customerId = customerId;
        this.coffeeType = coffeeType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public Size getSize() {
        return size;
    }

    public CoffeeOrder setSize(Size size) {
        this.size = size;
        return this;
    }

    public boolean shouldSteam() {
        return steamIt;
    }

    public CoffeeOrder setSteamIt(boolean steamIt) {
        this.steamIt = steamIt;
        return this;
    }
}
