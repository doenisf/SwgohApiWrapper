package help.swgoh.models.player.toon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

/**
 * This class represents a single skill/ability of a {@link Toon}.
 *
 * @since 1.0.0
 * @author doenisf
 */
@JsonIgnoreProperties(ignoreUnknown = true)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return tier == skill.tier && isZeta == skill.isZeta && tiers == skill.tiers && Objects.equals(id, skill.id) && Objects.equals(nameKey, skill.nameKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tier, nameKey, isZeta, tiers);
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id='" + id + '\'' +
                ", tier=" + tier +
                ", nameKey='" + nameKey + '\'' +
                ", isZeta=" + isZeta +
                ", tiers=" + tiers +
                '}';
    }
}
