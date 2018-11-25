import java.util.Objects;

/*
* Одиночка — это порождающий паттерн, который гарантирует существование
* только одного объекта определённого класса, а также позволяет
* достучаться до этого объекта из любого места программы.
* */
public final class Singleton {
    private static Singleton example;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getExample(String value) {
        if (example == null) {
            example = new Singleton(value);
        }
        return example;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Singleton singleton = (Singleton) o;
        return Objects.equals(value, singleton.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }
}