import Cars.Car;
import Cars.Manual;
import builders.CarBuilder;
import builders.CarManualBuilder;
import director.Director;

public class Main {

    public static void main(String[] args) {
         String seporator = "========================================";
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);


        Car car = builder.getResult();
        System.out.println(seporator+"\nПостроена машина вида:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();


        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nАвтомобильное руководство постройки:\n" + carManual.print());

        /*---------------------------------------------------------------------------------------------------------*/

        director.constructSUV(builder);

        Car car2 = builder.getResult();
        System.out.println(seporator+"\nПостроена машина вида:\n" + car2.getType());

        CarManualBuilder manualBuilder1 = new CarManualBuilder();

        director.constructSUV(manualBuilder1);
        Manual carManual1 = manualBuilder1.getResult();
        System.out.println("\nАвтомобильное руководство постройки:\n" + carManual1.print());
    }

}