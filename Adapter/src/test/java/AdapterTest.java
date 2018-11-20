

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AdapterTest {
    @org.junit.jupiter.api.Test
    public void adapterFromStrNumToCalcPowTest(){
        Adapter adapter = new AdapterFromStrNumToCalc();
        int intNum = adapter.adaptation(StringNum.read(8));
        assertEquals(64, SimpleMethods.pow(intNum));
    }

    @org.junit.jupiter.api.Test
    public void adapterFromStrNumToCalcIsEvenTest(){
        Adapter adapter = new AdapterFromStrNumToCalc();
        int intNum = adapter.adaptation(StringNum.read(12));
        assertTrue(SimpleMethods.isEven(intNum));
    }
    @org.junit.jupiter.api.Test
    public void adapterFromStrNumToCalcIsntEvenTest(){
        Adapter adapter = new AdapterFromStrNumToCalc();
        int intNum = adapter.adaptation(StringNum.read(11));
        assertFalse(SimpleMethods.isEven(intNum));
    }
}