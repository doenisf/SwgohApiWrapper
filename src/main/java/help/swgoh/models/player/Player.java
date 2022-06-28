package help.swgoh.models.player;

import help.swgoh.models.arena.PlayerArenaStats;
import help.swgoh.models.grandArena.GrandArenaHistory;
import help.swgoh.models.toon.Toon;

/**
 * This class represents all data associated with a player in SWGOH.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class Player {

    private int allyCode;
    private String id;
    private String name;
    private int level;
    private Titles titles;
    private String guildRefId;
    private String guildName;
    private String guildBannerColor;
    private String getGuildBannerLogo;
    private String guildTypeId;
    private Stat[] stats;
    private Toon[] roster;
    private PlayerArenaStats arena;
    private long lastActivity;
    private int poUTCOffsetMinutes;
    private Portraits portraits;
    private GrandArenaHistory[] grandArena;
    private int grandArenaLifetime;
    private long updated;

    public int getAllyCode() {
        return allyCode;
    }

    public void setAllyCode(int allyCode) {
        this.allyCode = allyCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Titles getTitles() {
        return titles;
    }

    public void setTitles(Titles titles) {
        this.titles = titles;
    }

    public String getGuildRefId() {
        return guildRefId;
    }

    public void setGuildRefId(String guildRefId) {
        this.guildRefId = guildRefId;
    }

    public String getGuildName() {
        return guildName;
    }

    public void setGuildName(String guildName) {
        this.guildName = guildName;
    }

    public String getGuildBannerColor() {
        return guildBannerColor;
    }

    public void setGuildBannerColor(String guildBannerColor) {
        this.guildBannerColor = guildBannerColor;
    }

    public String getGetGuildBannerLogo() {
        return getGuildBannerLogo;
    }

    public void setGetGuildBannerLogo(String getGuildBannerLogo) {
        this.getGuildBannerLogo = getGuildBannerLogo;
    }

    public String getGuildTypeId() {
        return guildTypeId;
    }

    public void setGuildTypeId(String guildTypeId) {
        this.guildTypeId = guildTypeId;
    }

    public Stat[] getStats() {
        return stats;
    }

    public void setStats(Stat[] stats) {
        this.stats = stats;
    }

    public Toon[] getRoster() {
        return roster;
    }

    public void setRoster(Toon[] roster) {
        this.roster = roster;
    }

    public PlayerArenaStats getArena() {
        return arena;
    }

    public void setArena(PlayerArenaStats arena) {
        this.arena = arena;
    }

    public long getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(long lastActivity) {
        this.lastActivity = lastActivity;
    }

    public int getPoUTCOffsetMinutes() {
        return poUTCOffsetMinutes;
    }

    public void setPoUTCOffsetMinutes(int poUTCOffsetMinutes) {
        this.poUTCOffsetMinutes = poUTCOffsetMinutes;
    }

    public Portraits getPortraits() {
        return portraits;
    }

    public void setPortraits(Portraits portraits) {
        this.portraits = portraits;
    }

    public GrandArenaHistory[] getGrandArena() {
        return grandArena;
    }

    public void setGrandArena(GrandArenaHistory[] grandArena) {
        this.grandArena = grandArena;
    }

    public int getGrandArenaLifetime() {
        return grandArenaLifetime;
    }

    public void setGrandArenaLifetime(int grandArenaLifetime) {
        this.grandArenaLifetime = grandArenaLifetime;
    }

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }
}
