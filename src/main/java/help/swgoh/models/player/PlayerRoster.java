package help.swgoh.models.player;

import help.swgoh.models.toon.Toon;

import java.util.Arrays;

/**
 * This class represents the roster of a {@link Player}.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class PlayerRoster {

    private Toon[] toons;

    public Toon[] getToons() {
        return toons;
    }

    public void setToons(Toon[] toons) {
        this.toons = toons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerRoster that = (PlayerRoster) o;
        return Arrays.equals(toons, that.toons);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(toons);
    }

    @Override
    public String toString() {
        return "PlayerRoster{" +
                "toons=" + Arrays.toString(toons) +
                '}';
    }
}
