package help.swgoh.models.player.grandArena;


import java.util.Objects;

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

    @Override
    public String toString() {
        return "GrandArenaHistory{" +
                "seasonId='" + seasonId + '\'' +
                ", eventInstanceId='" + eventInstanceId + '\'' +
                ", league='" + league + '\'' +
                ", wins=" + wins +
                ", losses=" + losses +
                ", eliteDivision=" + eliteDivision +
                ", seasonPoints=" + seasonPoints +
                ", division=" + division +
                ", joinTime=" + joinTime +
                ", endTime=" + endTime +
                ", remove=" + remove +
                ", rank=" + rank +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrandArenaHistory that = (GrandArenaHistory) o;
        return wins == that.wins && losses == that.losses && eliteDivision == that.eliteDivision && seasonPoints == that.seasonPoints && division == that.division && joinTime == that.joinTime && endTime == that.endTime && remove == that.remove && rank == that.rank && Objects.equals(seasonId, that.seasonId) && Objects.equals(eventInstanceId, that.eventInstanceId) && Objects.equals(league, that.league);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seasonId, eventInstanceId, league, wins, losses, eliteDivision, seasonPoints, division, joinTime, endTime, remove, rank);
    }
}
