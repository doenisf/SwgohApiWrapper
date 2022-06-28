package help.swgoh.models.arena;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.Objects;

/**
 * This class represents a {@link help.swgoh.models.player.Player}s current stats for character and ship arena.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class PlayerArenaStats {

    @JsonAlias({"char"})
    private ArenaStat arenaStat;
    private ArenaStat ship;

    public ArenaStat getArenaStat() {
        return arenaStat;
    }

    public void setArenaStat(ArenaStat arenaStat) {
        this.arenaStat = arenaStat;
    }

    public ArenaStat getShip() {
        return ship;
    }

    public void setShip(ArenaStat ship) {
        this.ship = ship;
    }

    @Override
    public String toString() {
        return "PlayerArenaStats{" +
                "arenaStat=" + arenaStat +
                ", ship=" + ship +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerArenaStats that = (PlayerArenaStats) o;
        return Objects.equals(arenaStat, that.arenaStat) && Objects.equals(ship, that.ship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arenaStat, ship);
    }
}
