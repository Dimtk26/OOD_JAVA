public class SDemo {
    public static void main(String[] args) {
        View context = new View();

        DraftState startState = new DraftState();
        startState.action(context);

        System.out.println(context.getState().toString());

        WriteState stopState = new WriteState();
        stopState.action(context);

        System.out.println(context.getState().toString());
    }
}