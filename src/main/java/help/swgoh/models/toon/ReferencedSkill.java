package help.swgoh.models.toon;

import java.util.Objects;

/**
 * This class represents the skills of a ship that are connected to a {@link CrewMember}.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class ReferencedSkill {

    private String skillId;
    private int requiredTier;
    private int requiredRarity;
    private int requiredRelicTier;

    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public int getRequiredTier() {
        return requiredTier;
    }

    public void setRequiredTier(int requiredTier) {
        this.requiredTier = requiredTier;
    }

    public int getRequiredRarity() {
        return requiredRarity;
    }

    public void setRequiredRarity(int requiredRarity) {
        this.requiredRarity = requiredRarity;
    }

    public int getRequiredRelicTier() {
        return requiredRelicTier;
    }

    public void setRequiredRelicTier(int requiredRelicTier) {
        this.requiredRelicTier = requiredRelicTier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReferencedSkill that = (ReferencedSkill) o;
        return requiredTier == that.requiredTier && requiredRarity == that.requiredRarity && requiredRelicTier == that.requiredRelicTier && Objects.equals(skillId, that.skillId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId, requiredTier, requiredRarity, requiredRelicTier);
    }

    @Override
    public String toString() {
        return "ReferencedSkill{" +
                "skillId='" + skillId + '\'' +
                ", requiredTier=" + requiredTier +
                ", requiredRarity=" + requiredRarity +
                ", requiredRelicTier=" + requiredRelicTier +
                '}';
    }
}
