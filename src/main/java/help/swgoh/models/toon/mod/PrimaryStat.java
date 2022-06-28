package help.swgoh.models.toon.mod;

/**
 * This class represents a primary stat of a {@link Mod}.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class PrimaryStat {

    private int unitStat;
    private float value;

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
}
