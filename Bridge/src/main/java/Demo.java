import mechanism.Mechanism;
import mechanism.EasyMechanism;
import mechanism.MediumMechanism;

import Employees.JuniorEmployee;
import Employees.SeniorEmployee;

public class Demo {
    public static void main(String[] args) {
        testDevice(new MediumMechanism());
        testDevice(new EasyMechanism());
    }

    public static void testDevice(Mechanism mechanism) {
        System.out.println("Tests with junior Employee.");
        JuniorEmployee juniorEmployee = new JuniorEmployee(mechanism);
        juniorEmployee.power();
        mechanism.printStatus();

        System.out.println("Tests with senior Employee.");
        SeniorEmployee seniorEmployee = new SeniorEmployee(mechanism);
        seniorEmployee.power();
        seniorEmployee.fullPower();
        mechanism.printStatus();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");
    }
}