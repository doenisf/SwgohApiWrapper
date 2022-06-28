package help.swgoh.models.player;

import java.math.BigInteger;

/**
 * This class represents a stat associated with a {@link Player}.
 *
 * Examples for a stat are the Galactic Power, the best rank in a season and many others.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class Stat {

    private String nameKey;
    private BigInteger value;
    private int index;

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
