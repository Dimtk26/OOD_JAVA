
public class AdapterFromStrNumForSimpleMethod implements Adapter{

    @Override
    public int adaptation(String strInt){
        return Integer.parseInt(strInt);
    }
}