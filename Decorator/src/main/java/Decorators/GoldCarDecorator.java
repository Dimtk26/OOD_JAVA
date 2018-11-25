package Decorators;

import Cars.Car;

public class GoldCarDecorator extends CarDecorator {
    public GoldCarDecorator(Car decorated) {
        super(decorated);
    }

    @Override
    public void print() {
        decorated.print();
        setColor();
    }

    private void setColor(){
        System.out.println("Color: GOLD");
    }
}