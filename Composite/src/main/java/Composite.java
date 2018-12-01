public class Composite {
    class Elem{
        Thing el;
        Elem next;

        Elem(Thing th){
            el = th;
        }

        Elem(){
            el = null;
        }
    }

    private Elem first;

    public Composite(){
        this.first = new Elem();
    }

    public void add(Thing th){
        if(first.el == null)
            first.el = th;
        else{
            Elem temp = first;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Elem(th);
        }
    }

    public int getPrice(){
        int res = 0;
        Elem temp = first;
        while(temp != null){
            res += temp.el.getPrice();
            temp = temp.next;
        }
        return res;
    }
}