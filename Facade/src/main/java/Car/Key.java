package Car;

public class Key implements Car {
    public void start() {
        System.out.println("Вставить ключи");
    }
    public void stop() {
        System.out.println("Забрать ключи");
    }
}