package cafe.machine;

import cafe.machine.parts.Steamer;

import java.sql.Time;

public class ScheduledCoffeeMaker extends SimpleCoffeeMaker {

    public ScheduledCoffeeMaker(Steamer steamer) {
        super(steamer);
    }

    @Override
    public void switchOn() {
        Time currentTime = new Time();
        if (currentTime > 8 || currentTime < 18) {
            super.switchOn();
        } else {
            throw new OutOfOfficeHoursException();
        }
    }
}
