public abstract class GoodPhone extends Builder {
    public GoodPhone(){
        phone = new Phone();
    }
    @Override
    public Phone buildPhone(){
        phone.buildCore(4);
        phone.buildDiagonal(5.5);
        Camera dualCamera = new DualCamera();
        phone.buildCamera(8);
        phone.buildMemory(64);
        phone.buildRam(4);
        phone.buildSensor(true);
        phone.buildPrice();
      return phone;
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.buildCore(2);
        phone.buildDiagonal(4.5);
        Camera dualCamera = new DualCamera();
        phone.buildCamera(8);
        phone.buildMemory(16);
        phone.buildRam(1);
        phone.buildSensor(true);
        phone.buildPrice();

    }
}
