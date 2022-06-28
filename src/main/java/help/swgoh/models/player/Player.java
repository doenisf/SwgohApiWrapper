package help.swgoh.models.player;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import help.swgoh.models.arena.PlayerArenaStats;
import help.swgoh.models.grandArena.GrandArenaHistory;
import help.swgoh.models.toon.Toon;

import java.util.Arrays;

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
    private int grandArenaLifetime;
    private long updated;

    /*
    @JsonCreator
    public Player(int allyCode, String id, String name,
                  int level, Titles titles, String guildRefId,
                  String guildName, String guildBannerColor,
                  String getGuildBannerLogo, String guildTypeId,
                  Stat[] stats, Toon[] roster, PlayerArenaStats arena,
                  long lastActivity, int poUTCOffsetMinutes,
                  Portraits portraits, GrandArenaHistory[] grandArena,
                  int grandArenaLifetime, long updated) {
        this.allyCode = allyCode;
        this.id = id;
        this.name = name;
        this.level = level;
        this.titles = titles;
        this.guildRefId = guildRefId;
        this.guildName = guildName;
        this.guildBannerColor = guildBannerColor;
        this.getGuildBannerLogo = getGuildBannerLogo;
        this.guildTypeId = guildTypeId;
        this.stats = stats;
        this.roster = roster;
        this.arena = arena;
        this.lastActivity = lastActivity;
        this.poUTCOffsetMinutes = poUTCOffsetMinutes;
        this.portraits = portraits;
        this.grandArena = grandArena;
        this.grandArenaLifetime = grandArenaLifetime;
        this.updated = updated;
    }

     */

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
                ", grandArenaLifetime=" + grandArenaLifetime +
                ", updated=" + updated +
                '}';
    }
}
