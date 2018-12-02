public class OTest {//тест
    public static void main(String[] args) {
        University university = new University();
        Director director = new Director();
        university.addObserver(director);
        university.addStudent("Дмитрий");
        university.addStudent("Андрей");
        university.addStudent("Роман");
        university.addStudent("Артур");
        university.addStudent("Прогульщик");

        university.removeStudent("Прогульщик");
    }
}