package help.swgoh.models.roster;

/**
 * This class represents the response to the getRoster(int allyCode) method.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class Roster {

    private RosterToon[] toons;

    public RosterToon[] getToons() {
        return toons;
    }

    public void setToons(RosterToon[] toons) {
        this.toons = toons;
    }
}
