abstract class Student { //Шаблонный метод
    abstract void wakeUp();
    abstract void fallSleep();

    public final void start(){
        wakeUp();
        fallSleep();
    }
}