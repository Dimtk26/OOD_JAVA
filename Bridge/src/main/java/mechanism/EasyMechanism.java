package mechanism;

public class EasyMechanism implements Mechanism {
    private boolean on = false;
    private int turn = 30;
    private int percent = 50;

    @Override
    public boolean isWorking() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getTurn() {
        return turn;
    }

    @Override
    public void setTurn(int turn) {
        if (turn > 100) {
            this.turn = 100;
        } else if (turn < 0) {
            this.turn = 0;
        } else {
            this.turn = turn;
        }
    }

    @Override
    public int getPower() {
        return percent;
    }

    @Override
    public void setPower(int percent) {
        this.percent = percent;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm EASY mechanism.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current turn/sec is " + turn );
        System.out.println("| Current power is " + percent + " %");
        System.out.println("------------------------------------\n");
    }
}
