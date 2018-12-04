public class DraftState implements State {

    public void action(View view) {
        System.out.println("Document is in Draft state:");
        view.setState(this);
    }

    public String toString(){
        return "Draft Document State.\n";
    }
}