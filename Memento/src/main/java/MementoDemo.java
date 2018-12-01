public class MementoDemo {
    public static void main(String[] args) {

      SaveUser saveUser1 = new SaveUser();
      SaveUser saveUser2 = new SaveUser();
      SaveUser saveUser3 = new SaveUser();

      User user1 = new User("First", 1);
      User user2 = new User("Second", 2);
      User user3 = new User("Third", 3);
        System.out.println("+++++++++++++++++++++++++++++++++");

      Memento memento1 = user1.save();
      Memento memento2 = user2.save();
      Memento memento3 = user3.save();

      saveUser1.addMemento(memento1);
      saveUser2.addMemento(memento2);
      saveUser3.addMemento(memento3);
        System.out.println("+++++++++++++++++++++++++++++++++");

       user1.restore(memento3);
        System.out.println("Теперь user1: "+user1.getName()+ " "+ user1.getAge());
        System.out.println("+++++++++++++++++++++++++++++++++");

        System.out.println(saveUser2.getMemento().getName()+" "+saveUser2.getMemento().getAge());


    }
}