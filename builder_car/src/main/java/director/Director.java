package director;

import Cars.Type;
import builders.Builder;
import components.Engine;
import components.Transmission;
import components.TripComputer;
import components.Wheel;

/*Директор в заданной последовательности просит работать строителя через интерфейс(Builder).
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(4.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setWheel(Wheel.EXTREME_WHEELS);
    }

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(1.8, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setWheel(Wheel.SUMMER_WHEELS);
    }

    public void constructSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setWheel(Wheel.ALLSEASON_WHEELS);
    }
}