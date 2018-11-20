package components;

/*
 Двигатель, одна из частей автомобиля.
 */
public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }


    public boolean isStarted() {
        return started;
    }



    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}