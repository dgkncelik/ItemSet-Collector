public class Participants {

    private Integer participantId;
    private String teamId;
    private String championId;
    private String spell1Id;
    private String spell2Id;
    private String highestAchievedSeasonTier;
    private Stats stats;

    public Participants(Integer participantId, String teamId, String championId, String spell1Id, String spell2Id, String highestAchievedSeasonTier, Stats stats) {
        this.participantId = participantId;
        this.teamId = teamId;
        this.championId = championId;
        this.spell1Id = spell1Id;
        this.spell2Id = spell2Id;
        this.highestAchievedSeasonTier = highestAchievedSeasonTier;
        this.stats = stats;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Integer getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getChampionId() {
        return championId;
    }

    public void setChampionId(String championId) {
        this.championId = championId;
    }

    public String getSpell1Id() {
        return spell1Id;
    }

    public void setSpell1Id(String spell1Id) {
        this.spell1Id = spell1Id;
    }

    public String getSpell2Id() {
        return spell2Id;
    }

    public void setSpell2Id(String spell2Id) {
        this.spell2Id = spell2Id;
    }

    public String getHighestAchievedSeasonTier() {
        return highestAchievedSeasonTier;
    }

    public void setHighestAchievedSeasonTier(String highestAchievedSeasonTier) {
        this.highestAchievedSeasonTier = highestAchievedSeasonTier;
    }

}
