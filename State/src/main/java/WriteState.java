
public class WriteState implements State {

    public void action(View view) {
        System.out.println("Document is in Write state:");
        view.setState(this);
    }

    public String toString(){
        return "Write Document State.\n";
    }
}