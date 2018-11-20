package Robot;

import java.util.Objects;

public class Terminator extends Robot {
    public int damage;

    public Terminator() {
    }

    public Terminator(Terminator target) {
        super(target);
        if (target != null) {
            this.damage = target.damage;
        }
    }

    @Override
    public Robot clone() {
        return new Terminator(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Terminator that = (Terminator) o;
        return damage == that.damage;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), damage);
    }

}