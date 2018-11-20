package Cars;


import components.Engine;
import components.Transmission;
import components.TripComputer;
import components.Wheel;

/*Руководство автомобиля — это второй продукт. Первым является класс Car*/

public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final Wheel wheel;


    public Manual(Type type, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, Wheel wheel) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.wheel = wheel;
    }

    public String print() {
        String info = "";
        info += "Тип автомобиля: " + type + "\n";
        info += "Количество сидений: " + seats + "\n";
        info += "Двигатель: объем - " + engine.getVolume() + "; пробег - " + engine.getMileage() + "\n";
        info += "Коробка передач: " + transmission + "\n";
        info += "Тип колес: " + wheel + "\n";
        if (this.tripComputer != null) {
            info += "Путевой компьютер: функциональный" + "\n";
        } else {
            info += "Путевой компьютер: N/A" + "\n";
        }
        return info;
    }
}