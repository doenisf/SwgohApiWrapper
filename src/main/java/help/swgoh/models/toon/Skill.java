package help.swgoh.models.toon;

/**
 * This class represents a single skill/ability of a {@link Toon}.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class Skill {

    private String id;
    private int tier;
    private String nameKey;
    private boolean isZeta;
    private int tiers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

    public boolean isZeta() {
        return isZeta;
    }

    public void setZeta(boolean zeta) {
        isZeta = zeta;
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
