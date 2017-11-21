public class Player {
    private String platformId;
    private String accountId;
    private String summonerName;
    private String summonerId;
    private String currentPlatformId;
    private String currentAccountId;
    private String matchHistoryUri;
    private String profileIcon;

    public Player(String platformId, String accountId, String summonerName, String summonerId, String currentPlatformId, String currentAccountId, String matchHistoryUri, String profileIcon) {
        this.platformId = platformId;
        this.accountId = accountId;
        this.summonerName = summonerName;
        this.summonerId = summonerId;
        this.currentPlatformId = currentPlatformId;
        this.currentAccountId = currentAccountId;
        this.matchHistoryUri = matchHistoryUri;
        this.profileIcon = profileIcon;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public String getCurrentPlatformId() {
        return currentPlatformId;
    }

    public void setCurrentPlatformId(String currentPlatformId) {
        this.currentPlatformId = currentPlatformId;
    }

    public String getCurrentAccountId() {
        return currentAccountId;
    }

    public void setCurrentAccountId(String currentAccountId) {
        this.currentAccountId = currentAccountId;
    }

    public String getMatchHistoryUri() {
        return matchHistoryUri;
    }

    public void setMatchHistoryUri(String matchHistoryUri) {
        this.matchHistoryUri = matchHistoryUri;
    }

    public String getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(String profileIcon) {
        this.profileIcon = profileIcon;
    }



}
