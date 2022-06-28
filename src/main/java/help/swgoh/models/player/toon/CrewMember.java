package help.swgoh.models.player.toon;

import java.util.Arrays;
import java.util.Objects;

public class CrewMember {

    private String unitId;
    private int slot;
    private ReferencedSkill[] skillReferenceList;
    private String skilllessCrewAbilityId;
    private int gp;
    private float cp;

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public ReferencedSkill[] getSkillReferenceList() {
        return skillReferenceList;
    }

    public void setSkillReferenceList(ReferencedSkill[] skillReferenceList) {
        this.skillReferenceList = skillReferenceList;
    }

    public String getSkilllessCrewAbilityId() {
        return skilllessCrewAbilityId;
    }

    public void setSkilllessCrewAbilityId(String skilllessCrewAbilityId) {
        this.skilllessCrewAbilityId = skilllessCrewAbilityId;
    }

    public int getGp() {
        return gp;
    }

    public void setGp(int gp) {
        this.gp = gp;
    }

    public float getCp() {
        return cp;
    }

    public void setCp(float cp) {
        this.cp = cp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrewMember that = (CrewMember) o;
        return slot == that.slot && gp == that.gp && Float.compare(that.cp, cp) == 0 && Objects.equals(unitId, that.unitId) && Arrays.equals(skillReferenceList, that.skillReferenceList) && Objects.equals(skilllessCrewAbilityId, that.skilllessCrewAbilityId);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(unitId, slot, skilllessCrewAbilityId, gp, cp);
        result = 31 * result + Arrays.hashCode(skillReferenceList);
        return result;
    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "unitId='" + unitId + '\'' +
                ", slot=" + slot +
                ", skillReferenceList=" + Arrays.toString(skillReferenceList) +
                ", skilllessCrewAbilityId='" + skilllessCrewAbilityId + '\'' +
                ", gp=" + gp +
                ", cp=" + cp +
                '}';
    }
}
