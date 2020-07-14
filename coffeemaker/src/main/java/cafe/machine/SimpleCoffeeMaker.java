package cafe.machine;

import cafe.Coffee;
import cafe.machine.parts.Steamer;
import cafe.order.CoffeeOrder;
import cafe.props.CoffeeType;
import cafe.props.Size;

public class SimpleCoffeeMaker implements CoffeeMaker {

    private String brand = "Chai";
    private String model = "Tea";

    private boolean switchedOn;

    private Steamer steamer;


    public SimpleCoffeeMaker(Steamer steamer) {
        this.steamer = steamer;
        this.switchedOn = false;
    }

    public void switchOn() {
        this.switchedOn = true;
    }

    public void switchOff() {
        this.switchedOn = false;
    }


    @Override
    public Coffee makeCoffee(CoffeeOrder order) throws CoffeeMachineTurnedOffException {
        if (switchedOn) {
            CoffeeType coffeeType = order.getCoffeeType();
            Size size = order.getSize();
            boolean steamIt = order.shouldSteam();
            return makeCoffeeInternal(coffeeType, size, steamIt);
        }
        throw new CoffeeMachineTurnedOffException("Please turn on the machine");
    }

    private Coffee makeCoffeeInternal(CoffeeType coffeeType, Size size, boolean steamIt) {
        Coffee coffee = new Coffee(coffeeType, size);
        return steamIt ? steamer.steam(coffee) : coffee;
    }
}
