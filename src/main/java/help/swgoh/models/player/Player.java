package help.swgoh.models.player;

import help.swgoh.models.player.arena.PlayerArenaStats;
import help.swgoh.models.player.grandArena.GrandArenaHistory;
import help.swgoh.models.player.toon.Toon;

import java.util.Arrays;
import java.util.Objects;

/**
 * This class represents all data associated with a player in SWGOH.
 *
 * @author doenisf
 * @since 1.0.0
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
    private String guildBannerLogo;
    private String guildTypeId;
    private Stat[] stats;
    private Toon[] roster;
    private PlayerArenaStats arena;
    private long lastActivity;
    private int poUTCOffsetMinutes;
    private Portraits portraits;
    private GrandArenaHistory[] grandArena;
    private int grandArenaLifeTime;
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

    public String getGuildBannerLogo() {
        return guildBannerLogo;
    }

    public void setGetGuildBannerLogo(String guildBannerLogo) {
        this.guildBannerLogo = guildBannerLogo;
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

    public int getGrandArenaLifeTime() {
        return grandArenaLifeTime;
    }

    public void setGrandArenaLifeTime(int grandArenaLifeTime) {
        this.grandArenaLifeTime = grandArenaLifeTime;
    }

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Player{" +
                "allyCode=" + allyCode +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", titles=" + titles +
                ", guildRefId='" + guildRefId + '\'' +
                ", guildName='" + guildName + '\'' +
                ", guildBannerColor='" + guildBannerColor + '\'' +
                ", getGuildBannerLogo='" + guildBannerLogo + '\'' +
                ", guildTypeId='" + guildTypeId + '\'' +
                ", stats=" + Arrays.toString(stats) +
                ", roster=" + Arrays.toString(roster) +
                ", arena=" + arena +
                ", lastActivity=" + lastActivity +
                ", poUTCOffsetMinutes=" + poUTCOffsetMinutes +
                ", portraits=" + portraits +
                ", grandArena=" + Arrays.toString(grandArena) +
                ", grandArenaLifetime=" + grandArenaLifeTime +
                ", updated=" + updated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return allyCode == player.allyCode && level == player.level &&
                lastActivity == player.lastActivity &&
                poUTCOffsetMinutes == player.poUTCOffsetMinutes &&
                grandArenaLifeTime == player.grandArenaLifeTime &&
                updated == player.updated && Objects.equals(id, player.id) &&
                Objects.equals(name, player.name) &&
                Objects.equals(titles, player.titles) &&
                Objects.equals(guildRefId, player.guildRefId) &&
                Objects.equals(guildName, player.guildName) &&
                Objects.equals(guildBannerColor, player.guildBannerColor) &&
                Objects.equals(guildBannerLogo, player.guildBannerLogo) &&
                Objects.equals(guildTypeId, player.guildTypeId) &&
                Arrays.equals(stats, player.stats) &&
                Arrays.equals(roster, player.roster) &&
                Objects.equals(arena, player.arena) &&
                Objects.equals(portraits, player.portraits) &&
                Arrays.equals(grandArena, player.grandArena);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(allyCode, id, name, level,
                titles, guildRefId, guildName, guildBannerColor,
                guildBannerLogo, guildTypeId, arena, lastActivity,
                poUTCOffsetMinutes, portraits, grandArenaLifeTime, updated);
        result = 31 * result + Arrays.hashCode(stats);
        result = 31 * result + Arrays.hashCode(roster);
        result = 31 * result + Arrays.hashCode(grandArena);
        return result;
    }
}
