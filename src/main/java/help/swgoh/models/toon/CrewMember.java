package help.swgoh.models.toon;

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
}
