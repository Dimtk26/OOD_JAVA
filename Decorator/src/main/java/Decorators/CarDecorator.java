package Decorators;

import Cars.Car;

public class CarDecorator implements Car {
    protected Car decorated;
    public CarDecorator(Car decorated){
        this.decorated = decorated;
    }

    @Override
    public void print(){
        decorated.print();
    }
}
