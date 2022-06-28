package help.swgoh.models.toon.mod;

/**
 * This class represents a {@link Mod}.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class Mod {

    private String id;
    private int level;
    private int tier;
    private int slot;
    private int set;
    private int pips;
    private PrimaryStat primaryStat;
    private SecondaryStat[] secondaryStat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public int getPips() {
        return pips;
    }

    public void setPips(int pips) {
        this.pips = pips;
    }

    public PrimaryStat getPrimaryStat() {
        return primaryStat;
    }

    public void setPrimaryStat(PrimaryStat primaryStat) {
        this.primaryStat = primaryStat;
    }

    public SecondaryStat[] getSecondaryStat() {
        return secondaryStat;
    }

    public void setSecondaryStat(SecondaryStat[] secondaryStat) {
        this.secondaryStat = secondaryStat;
    }
}
