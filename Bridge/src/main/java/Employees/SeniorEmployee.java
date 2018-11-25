package Employees;

import mechanism.Mechanism;

public class SeniorEmployee extends JuniorEmployee {
    public SeniorEmployee(Mechanism mechanism) {
        super.mechanism = mechanism;
    }

    public void fullPower() {
        System.out.println("Employee: full Power");
        mechanism.setPower(100);
    }
}
