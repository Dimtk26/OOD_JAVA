package Employees;

import mechanism.Mechanism;

public class JuniorEmployee implements Employee{
    protected Mechanism mechanism;

    public JuniorEmployee() {}

    public JuniorEmployee(Mechanism mechanism) {
        this.mechanism = mechanism;
    }

    @Override
    public void power() {
        System.out.println("Employee: power button");
        if (mechanism.isWorking()) {
            mechanism.disable();
        } else {
            mechanism.enable();
        }
    }

    @Override
    public void turnSlow() {
        System.out.println("Employee: turn slow");
        mechanism.setTurn(mechanism.getTurn() - 2);
    }

    @Override
    public void turnFaster() {
        System.out.println("Employee: turn faster");
        mechanism.setTurn(mechanism.getTurn() + 2);
    }

    @Override
    public void percentDown() {
        System.out.println("Employee: percent down");
        mechanism.setPower(mechanism.getPower() - 8);
    }

    @Override
    public void percentUp() {
        System.out.println("Employee: percent up");
        mechanism.setPower(mechanism.getPower() + 8);
    }
}
