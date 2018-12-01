class MyCar implements Cars {
    private String car;
    public MyCar(String car){
        this.car = car;
        trail(car);
    }
    private void trail(String car){
        System.out.println("Меня везёт " + car);
    }
    public void go() {
        System.out.println("Водить " + car);
    }
}