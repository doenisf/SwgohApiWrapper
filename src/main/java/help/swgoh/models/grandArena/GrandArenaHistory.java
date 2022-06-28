package help.swgoh.models.grandArena;


/**
 * This class represents a {@link help.swgoh.models.player.Player}s stats for one season of grand arena.
 *
 * @since 1.0.0
 * @author doenisf
 */
public class GrandArenaHistory {

    private String seasonId;
    private String eventInstanceId;
    private String league;
    private int wins;
    private int losses;
    private boolean eliteDivision;
    private int seasonPoints;
    private int division;
    private long joinTime;
    private long endTime;
    private boolean remove;
    private int rank;

    public String getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public String getEventInstanceId() {
        return eventInstanceId;
    }

    public void setEventInstanceId(String eventInstanceId) {
        this.eventInstanceId = eventInstanceId;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public boolean isEliteDivision() {
        return eliteDivision;
    }

    public void setEliteDivision(boolean eliteDivision) {
        this.eliteDivision = eliteDivision;
    }

    public int getSeasonPoints() {
        return seasonPoints;
    }

    public void setSeasonPoints(int seasonPoints) {
        this.seasonPoints = seasonPoints;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public long getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(long joinTime) {
        this.joinTime = joinTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public boolean isRemove() {
        return remove;
    }

    public void setRemove(boolean remove) {
        this.remove = remove;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
