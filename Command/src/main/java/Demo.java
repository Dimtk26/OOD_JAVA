import Car.Car;
import Car.CarInvoker;
import Car.StartCar;
import Car.StopCar;

public class Demo {//тест
    public static void main(String[] args) {
        Car car = new Car();
        StartCar startCar = new StartCar(car);
        StopCar stopCar = new StopCar(car);
        CarInvoker carInvoker = new CarInvoker(startCar,stopCar);
        carInvoker.execute();

    }
}