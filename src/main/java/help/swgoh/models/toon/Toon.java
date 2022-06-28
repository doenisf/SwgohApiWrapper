package help.swgoh.models.toon;

import help.swgoh.models.player.Titles;
import help.swgoh.models.toon.mod.Mod;

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
}
