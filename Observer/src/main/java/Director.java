import java.util.List;

class Director implements Observer {
    public void event(List<String> strings) {
        System.out.println("В списке студентов произошли изменения: " + strings);
    }
}