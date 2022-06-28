package help.swgoh.models.arena;

import java.util.Arrays;
import java.util.Objects;

/**
 * This class represents a {@link help.swgoh.models.player.Player}s current rank and squad/fleet
 * in the arena/fleet arena.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class ArenaStat {

    private int rank;
    private ArenaToon[] squad;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public ArenaToon[] getSquad() {
        return squad;
    }

    public void setSquad(ArenaToon[] squad) {
        this.squad = squad;
    }

    @Override
    public String toString() {
        return "ArenaStat{" +
                "rank=" + rank +
                ", squad=" + Arrays.toString(squad) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArenaStat arenaStat = (ArenaStat) o;
        return rank == arenaStat.rank && Arrays.equals(squad, arenaStat.squad);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(rank);
        result = 31 * result + Arrays.hashCode(squad);
        return result;
    }
}
