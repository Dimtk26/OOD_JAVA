package Car;

import Command.Command;

public class StopCar implements Command {
    Car car;
    public StopCar(Car car) {
        this.car = car;
    }
    public void execute() {
        car.stopEngine();
    }
}
