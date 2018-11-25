import Cars.Car;
import Cars.SportCar;
import Cars.StandartCar;
import Decorators.CarDecorator;
import Decorators.GoldCarDecorator;


public class Demo {

    public static void main(String[] args) {
        Car sportCar = new SportCar();
        Car goldStandartCar = new GoldCarDecorator(new StandartCar());
        sportCar.print();
        goldStandartCar.print();
    }
}