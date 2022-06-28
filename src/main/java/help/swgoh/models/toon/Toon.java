package help.swgoh.models.toon;

import help.swgoh.models.toon.mod.Mod;

/**
 * This class represents a single toon of a {@link help.swgoh.models.player.Player}.
 *
 * @since 1.0.0
 * @author doenisf
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
}
