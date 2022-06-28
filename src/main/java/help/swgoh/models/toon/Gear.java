package help.swgoh.models.toon;

/**
 * This class represents a single piece of gear equipped to a {@link Toon}.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class Gear {

    private String equipmentId;
    private int slot;
    private String nameKey;

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }
}
