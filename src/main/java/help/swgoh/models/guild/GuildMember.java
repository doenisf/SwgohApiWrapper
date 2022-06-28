package help.swgoh.models.guild;

import java.math.BigInteger;
import java.util.Objects;

/**
 * The representation of a {@link help.swgoh.models.player.Player} as a member of a {@link Guild}.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class GuildMember {

    private String id;
    private int guildMemberLevel;
    private String name;
    private int level;
    private int allyCode;
    private int gp;
    private int gpChar;
    private int gpShip;
    private BigInteger updated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGuildMemberLevel() {
        return guildMemberLevel;
    }

    public void setGuildMemberLevel(int guildMemberLevel) {
        this.guildMemberLevel = guildMemberLevel;
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

    public int getAllyCode() {
        return allyCode;
    }

    public void setAllyCode(int allyCode) {
        this.allyCode = allyCode;
    }

    public int getGp() {
        return gp;
    }

    public void setGp(int gp) {
        this.gp = gp;
    }

    public int getGpChar() {
        return gpChar;
    }

    public void setGpChar(int gpChar) {
        this.gpChar = gpChar;
    }

    public int getGpShip() {
        return gpShip;
    }

    public void setGpShip(int gpShip) {
        this.gpShip = gpShip;
    }

    public BigInteger getUpdated() {
        return updated;
    }

    public void setUpdated(BigInteger updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "GuildMember{" +
                "id='" + id + '\'' +
                ", guildMemberLevel=" + guildMemberLevel +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", allyCode=" + allyCode +
                ", gp=" + gp +
                ", gpChar=" + gpChar +
                ", gpShip=" + gpShip +
                ", updated=" + updated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuildMember that = (GuildMember) o;
        return guildMemberLevel == that.guildMemberLevel && level == that.level && allyCode == that.allyCode && gp == that.gp && gpChar == that.gpChar && gpShip == that.gpShip && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(updated, that.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, guildMemberLevel, name, level, allyCode, gp, gpChar, gpShip, updated);
    }
}
