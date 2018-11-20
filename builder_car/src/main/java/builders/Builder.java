package builders;

import Cars.Type;
import components.Engine;
import components.Transmission;
import components.TripComputer;
import components.Wheel;


public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setWheel(Wheel wheel);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
}