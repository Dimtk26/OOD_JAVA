package Country.CH;

import ISneakers.Adidas;
import ISneakers.IAbstractFactory;
import ISneakers.Nike;
import ISneakers.Reebok;

public class CHSneakersAbsractFactory implements IAbstractFactory {
    public Adidas getAdidas() {
        return new CHAdidasImpl();
    }

    public Nike getNike() {
        return new CHNikeImpl();
    }

    public Reebok getReebok() {
        return new CHReebokImpl();
    }
}