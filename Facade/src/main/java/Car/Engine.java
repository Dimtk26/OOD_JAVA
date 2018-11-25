package Car;

public class Engine implements Car {
    public void start() {
        System.out.println("Запустить двигатель");
    }
    public void stop() {
        System.out.println("Заглушить двигатель");
    }
}