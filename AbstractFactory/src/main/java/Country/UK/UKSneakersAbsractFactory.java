package Country.UK;

import ISneakers.Adidas;
import ISneakers.IAbstractFactory;
import ISneakers.Nike;
import ISneakers.Reebok;

public class UKSneakersAbsractFactory implements IAbstractFactory {
    public Adidas getAdidas() {
        return new UKAdidasImpl();
    }

    public Nike getNike() {
        return new UKNikeImpl();
    }

    public Reebok getReebok() {
        return new UKReebokImpl();
    }
}