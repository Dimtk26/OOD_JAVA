import static com.sun.webkit.perf.WCFontPerfLogger.log;

public class Phone {
    private int core;
    private double diagonal;
    private double megapixel;
    private int memory;
    private int ram;
    private boolean isSensor;
    private double price;
    public int getPrice() {
        return core;
    }

    public void buildPrice() {
        price = (core*900)+(memory*430)+(ram*800)+(megapixel*400)+(diagonal*350);
       /* if(megapixel>5){price = price*(megapixel/(1.6));}
        else {
            price = price*megapixel;
        }
        if(diagonal>5){price = price*(diagonal/1.5);}
        else {
            price = price*diagonal;
        }*/
        if (isSensor){price = price*1.2;}
        log("price:"+price);
    }

    public Phone() {
    }

    private void log(String msg){
        System.out.println(msg);
    }

    public int getCore() {
        return core;
    }

    public void buildCore(int core) {
        this.core = core;
        log("setting core to:"+core);
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void buildDiagonal(double diagonal) {
        this.diagonal = diagonal;
        log("setting diagonal to:"+diagonal);
    }

    public double getCamera() {
        return megapixel;
    }

    public void buildCamera(double megapixel) {
        this.megapixel = megapixel;
        log("setting megapixel to:"+megapixel);
    }

    ///////////////////////

    @Override
    public String toString() {
        return "Phone{" +
                "core=" + core +
                ", diagonal=" + diagonal +
                ", megapixel=" + megapixel +
                ", memory=" + memory +
                ", ram=" + ram +
                ", isSensor=" + isSensor +
                ", price=" + price +
                '}';
    }

    ///////////////////////


    public int getMemory() {
        return memory;
    }

    public void buildMemory(int memory) {
        this.memory = memory;
        log("setting memoty to:"+memory);
    }

    public int getRam() {
        return ram;
    }

    public void buildRam(int ram) {
        this.ram = ram;
        log("setting ram to:"+ram);
    }

    public boolean isSensor() {
        return isSensor;
    }

    public void buildSensor(boolean sensor) {
        isSensor = sensor;
        log("setting sensor to:"+sensor);
    }
}


