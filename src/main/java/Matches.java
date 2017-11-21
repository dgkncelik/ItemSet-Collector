public class Matches {
    private String lane;
    private String gameId;
    private String champion;
    private String platformId;
    private String timestamp;
    private String queue;
    private String role;
    private String season;

    public Matches(String lane, String gameId, String champion, String platformId, String timestamp, String queue, String role, String season) {
        this.lane = lane;
        this.gameId = gameId;
        this.champion = champion;
        this.platformId = platformId;
        this.timestamp = timestamp;
        this.queue = queue;
        this.role = role;
        this.season = season;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }




}
