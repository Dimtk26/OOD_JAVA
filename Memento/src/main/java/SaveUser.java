import java.util.ArrayList;
import java.util.List;

class SaveUser {
    private List<Memento> mementos = new ArrayList<Memento>();
    public void addMemento(Memento memento) {
        mementos.add(memento);
    }
    public Memento getMemento() {
        return mementos.get(0);
    }
}