package Car;

import Command.Command;

public class CarInvoker {
    public Command command;
    public Command command1;
    public CarInvoker(Command command){
        this.command = command;
    }
    public CarInvoker(Command command, Command command1){
        this.command = command;
        this.command1 = command1;
    }

    public void execute(){
        this.command.execute();
        this.command1.execute();
    }

}
