import Country.CH.CHSneakersAbsractFactory;
import Country.UK.UKSneakersAbsractFactory;
import ISneakers.IAbstractFactory;
import ISneakers.Nike;

public class AbstractFactoryTest {//тест

    public static void main(String[] args) {
        String country = "CH";
        IAbstractFactory ifactory = null;
        if (country.equals("UK")) {
            ifactory = new UKSneakersAbsractFactory();
        } else if (country.equals("CH")) {
            ifactory = new CHSneakersAbsractFactory();
        }

        Nike cNike = ifactory.getNike();
        System.out.println("China Nike price: "+cNike.getNikePrice());

    }
}