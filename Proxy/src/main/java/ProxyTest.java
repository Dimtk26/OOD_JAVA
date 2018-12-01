public class ProxyTest {//тест
    public static void main(String[] args) {
        Cars myCar = new ProxyMyCarTAXI("taxi");
        myCar.go();
        myCar.go();
    }
}