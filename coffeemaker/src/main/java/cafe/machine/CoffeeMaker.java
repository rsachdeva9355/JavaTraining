package cafe.machine;

import cafe.Coffee;
import cafe.order.CoffeeOrder;

public interface CoffeeMaker {
    Coffee makeCoffee(CoffeeOrder coffeeOrder) throws CoffeeMachineTurnedOffException;

    class CoffeeMachineTurnedOffException extends Throwable {

        public CoffeeMachineTurnedOffException(String message) {
        }
    }
}
