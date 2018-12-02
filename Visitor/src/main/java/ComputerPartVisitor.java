public interface ComputerPartVisitor {  //определяет операции класса посетителя
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}