public class Demo {
    public static void main(String[] args) {
        Composite composite = new Composite();
        Apples apple = new Apples();
        Shoes shoe = new Shoes();

        for(int i = 0; i < 3; i++) {
            composite.add(shoe);
        }

        for(int i = 0; i < 10; i++){
            composite.add(apple);
        }


        System.out.println("Общая сумма: "+composite.getPrice()+"\u20BD.");

    }



}
