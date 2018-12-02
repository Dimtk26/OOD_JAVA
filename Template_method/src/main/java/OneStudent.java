class OneStudent extends Student {
    @Override
    public void wakeUp() {
        System.out.println(" I'm ready.");
    }

    @Override
    public void fallSleep() {
        System.out.println(" Fell to sleep.");
    }
}