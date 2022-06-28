package help.swgoh.models.arena;

/**
 * This class represents a {@link help.swgoh.models.player.Player}s current stats for character and ship arena.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class PlayerArenaStats {

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
}
