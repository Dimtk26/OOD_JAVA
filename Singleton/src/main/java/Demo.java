public class Demo {
    public static void main(String[] args) {
        System.out.println("Если вы видите одно и то же значение, то singleton был повторно использован  (+)" + "\n" +
                "Если вы видите разные значения, то были созданы 2 синглтона (-)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getExample("Да");
        Singleton anotherSingleton = Singleton.getExample("Нет");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

        if (singleton.equals(anotherSingleton)){
            System.out.println("\nПохоже, что singleton был повторно использован (+)");
        }
        else {
            System.out.println("\nКажется, что были созданы 2 синглтона (-)");
        }
    }
}