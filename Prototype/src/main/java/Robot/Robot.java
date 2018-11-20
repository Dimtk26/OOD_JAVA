package Robot;
import java.util.Objects;

public abstract class Robot {
    public String name;
    public int weight;
    public boolean isFriendly;

    public Robot() {
    }

    public Robot(Robot target) {
        if (target != null) {
            this.name = target.name;
            this.weight = target.weight;
            this.isFriendly = target.isFriendly;
        }
    }

    public abstract Robot clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return weight == robot.weight &&
                isFriendly == robot.isFriendly &&
                Objects.equals(name, robot.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, weight, isFriendly);
    }
}