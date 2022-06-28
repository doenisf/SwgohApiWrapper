package help.swgoh.models.player;

/**
 * This class represtens the portraits selected and unlocked by a {@link Player}.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class Portraits {

    private String selected;
    private String[] unlocked;

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public String[] getUnlocked() {
        return unlocked;
    }

    public void setUnlocked(String[] unlocked) {
        this.unlocked = unlocked;
    }
}
