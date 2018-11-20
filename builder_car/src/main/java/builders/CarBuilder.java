package builders;


import Cars.Car;
import Cars.Type;
import components.Engine;
import components.Transmission;
import components.TripComputer;
import components.Wheel;


public class CarBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private Wheel wheel;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, wheel);
    }
}