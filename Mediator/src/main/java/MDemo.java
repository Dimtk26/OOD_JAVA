public class MDemo {
    public static void main(String[] args) {
        User dima = new User("Dima");
        User andrey = new User("Andrey");
        User artur = new User("Artur");

        artur.sendMessage("Привет, вы все паттерны сдали?");
        dima.sendMessage("Привет! Еще немного!");
        andrey.sendMessage("Да! еще несколько и все!");

    }
}