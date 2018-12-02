public class TDemo {//тест
    public static void main(String[] args) {
        Student student1 = new OneStudent();
        student1.start();
        System.out.println("==============");
        Student student2 = new TwoStudent();
        student2.start();
    }
}