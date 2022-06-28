package help.swgoh.models.arena;

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
}
