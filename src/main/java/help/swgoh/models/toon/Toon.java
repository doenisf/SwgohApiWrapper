package help.swgoh.models.toon;

import help.swgoh.models.toon.mod.Mod;

/**
 * This class represents a single toon of a {@link help.swgoh.models.player.Player}.
 *
 * @author doenisf
 * @since 1.0.0
 */
public class Toon {

    private String id;
    private String defId;
    private String nameKey;
    private int rarity;
    private int level;
    private int xp;
    private int gear;
    private Gear[] equipped;
    private int combatType;
    private Skill[] skills;
    private Mod[] mods;
    private CrewMember[] crew;
    private int gp;
    private PrimaryUnitStat primaryUnitStat;
    private Relic relic;

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

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public Gear[] getEquipped() {
        return equipped;
    }

    public void setEquipped(Gear[] equipped) {
        this.equipped = equipped;
    }

    public int getCombatType() {
        return combatType;
    }

    public void setCombatType(int combatType) {
        this.combatType = combatType;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public void setSkills(Skill[] skills) {
        this.skills = skills;
    }

    public Mod[] getMods() {
        return mods;
    }

    public void setMods(Mod[] mods) {
        this.mods = mods;
    }

    public CrewMember[] getCrew() {
        return crew;
    }

    public void setCrew(CrewMember[] crew) {
        this.crew = crew;
    }

    public int getGp() {
        return gp;
    }

    public void setGp(int gp) {
        this.gp = gp;
    }

    public PrimaryUnitStat getPrimaryUnitStat() {
        return primaryUnitStat;
    }

    public void setPrimaryUnitStat(PrimaryUnitStat primaryUnitStat) {
        this.primaryUnitStat = primaryUnitStat;
    }

    public Relic getRelic() {
        return relic;
    }

    public void setRelic(Relic relic) {
        this.relic = relic;
    }

    /**
     * Represents the relic level of the {@link Toon}.
     */
    private static class Relic {
        int currentTier;

        public int getCurrentTier() {
            return currentTier;
        }

        public void setCurrentTier(int currentTier) {
            this.currentTier = currentTier;
        }
    }

    /**
     * Currently not known what it is used for.
     */
    // TODO: implement when needed.
    private static class PrimaryUnitStat {

    }
}
