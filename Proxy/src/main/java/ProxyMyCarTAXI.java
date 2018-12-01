class ProxyMyCarTAXI implements Cars {
    private String taxi;
    private MyCar car;
    public ProxyMyCarTAXI(String taxi){
        this.taxi = taxi;
    }
    public void go() {
        if(car == null){
            car = new MyCar(taxi);
        }
        car.go();
    }
}