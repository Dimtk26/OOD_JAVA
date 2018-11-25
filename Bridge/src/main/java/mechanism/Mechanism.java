package mechanism;

public interface Mechanism {

    boolean isWorking();

    void enable();

    void disable();

    int getTurn();

    void setTurn(int turn);

    int getPower();

    void setPower(int percent);

    void printStatus();
}
