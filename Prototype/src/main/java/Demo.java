import Robot.Robot;
import Robot.Terminator;
import Robot.T1000;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Demo {
    public static void main(String[] args) {
        List<Robot> robot = new ArrayList<>();
        List<Robot> robotCopy = new ArrayList<>();

        Terminator terminator = new Terminator();
        terminator.name = "T800";
        terminator.weight = 300;
        terminator.isFriendly = true;
        robot.add(terminator);

        Terminator anotherTerminator = (Terminator) terminator.clone();
        robot.add(anotherTerminator);

        T1000 badTerminator = new T1000();
        badTerminator.isRegeneration = true;
        badTerminator.speed = 50;
        robot.add(badTerminator);

        cloneAndCompare(robot, robotCopy);
    }

    private static void cloneAndCompare(List<Robot> robot, List<Robot> robotCopy) {
        for (Robot rt : robot) {
            robotCopy.add(rt.clone());
        }

        for (int i = 0; i < robot.size(); i++) {
            if (robot.get(i) != robotCopy.get(i)) {
                System.out.println(i + ": Роботы - разные объекты (+)");
                if (robot.get(i).equals(robotCopy.get(i))) {
                    System.out.println(i + ": Они одинаковы (+)");
                } else {
                    System.out.println(i + ": Эти не идентичны (-)");
                }
            } else {
                System.out.println(i + ": Роботы одинаковы (-)");
            }
        }
    }
}