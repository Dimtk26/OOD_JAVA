public class IDemo {

    public static void main(String[] args) {
        NameBank namesRepository = new NameBank();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println(" Имя : " + name);
        }
    }
}