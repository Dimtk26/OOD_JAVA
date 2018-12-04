class CTest {
    public static void main(String[] args) {

        Chain c1 = new NegativeHandler();
        Chain c2 = new ZeroHandler();
        Chain c3 = new PositiveHandler();

        c1.setNext(c2);
        c2.setNext(c3);

        c1.process(new Number(26));
        c1.process(new Number(-20));
        c1.process(new Number(0));
        c1.process(new Number(11));
    }
}