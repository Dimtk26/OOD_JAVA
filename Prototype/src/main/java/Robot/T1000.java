package Robot;

import java.util.Objects;

public class T1000 extends Robot {
    public boolean isRegeneration;
    public int speed;

    public T1000() {
    }

    public T1000(T1000 target) {
        super(target);
        if (target != null) {
            this.isRegeneration = target.isRegeneration;
            this.speed = target.speed;
        }
    }

    @Override
    public Robot clone() {
        return new T1000(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        T1000 t1000 = (T1000) o;
        return isRegeneration == t1000.isRegeneration &&
                speed == t1000.speed;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), isRegeneration, speed);
    }
}


