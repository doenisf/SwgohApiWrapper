package help.swgoh.models.arena;

/**
 * This class represents a toon used in the {@link ArenaStat} squad of a {@link help.swgoh.models.player.Player}.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class ArenaToon {

    private String id;
    private String defId;
    private int squadUnitType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDefId() {
        return defId;
    }

    public void setDefId(String defId) {
        this.defId = defId;
    }

    public int getSquadUnitType() {
        return squadUnitType;
    }

    public void setSquadUnitType(int squadUnitType) {
        this.squadUnitType = squadUnitType;
    }
}
