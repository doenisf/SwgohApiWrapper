package help.swgoh.models.toon.mod;

/**
 * This class represents a secondary stat of a {@link Mod}.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class SecondaryStat {

    private int unitStat;
    private float value;
    private int roll;

    public int getUnitStat() {
        return unitStat;
    }

    public void setUnitStat(int unitStat) {
        this.unitStat = unitStat;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
