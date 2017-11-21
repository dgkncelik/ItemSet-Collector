public class Teams {
    private String teamId;
    private String win;
    private String firstBlood;
    private String firstTower;
    private String firstInhibitor;
    private String firstDragon;
    private String firstRiftHerald;
    private String towerKills;
    private String inhibitorKills;
    private String baronKills;
    private String vilemawKills;
    private String riftHeraldKills;
    private String dominionVictoryScore;


    public Teams(String teamId, String win, String firstBlood, String firstTower, String firstInhibitor, String firstDragon, String firstRiftHerald, String towerKills, String inhibitorKills, String baronKills, String vilemawKills, String riftHeraldKills, String dominionVictoryScore, String bans) {
        this.teamId = teamId;
        this.win = win;
        this.firstBlood = firstBlood;
        this.firstTower = firstTower;
        this.firstInhibitor = firstInhibitor;
        this.firstDragon = firstDragon;
        this.firstRiftHerald = firstRiftHerald;
        this.towerKills = towerKills;
        this.inhibitorKills = inhibitorKills;
        this.baronKills = baronKills;
        this.vilemawKills = vilemawKills;
        this.riftHeraldKills = riftHeraldKills;
        this.dominionVictoryScore = dominionVictoryScore;

    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public String getFirstBlood() {
        return firstBlood;
    }

    public void setFirstBlood(String firstBlood) {
        this.firstBlood = firstBlood;
    }

    public String getFirstTower() {
        return firstTower;
    }

    public void setFirstTower(String firstTower) {
        this.firstTower = firstTower;
    }

    public String getFirstInhibitor() {
        return firstInhibitor;
    }

    public void setFirstInhibitor(String firstInhibitor) {
        this.firstInhibitor = firstInhibitor;
    }

    public String getFirstDragon() {
        return firstDragon;
    }

    public void setFirstDragon(String firstDragon) {
        this.firstDragon = firstDragon;
    }

    public String getFirstRiftHerald() {
        return firstRiftHerald;
    }

    public void setFirstRiftHerald(String firstRiftHerald) {
        this.firstRiftHerald = firstRiftHerald;
    }

    public String getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(String towerKills) {
        this.towerKills = towerKills;
    }

    public String getInhibitorKills() {
        return inhibitorKills;
    }

    public void setInhibitorKills(String inhibitorKills) {
        this.inhibitorKills = inhibitorKills;
    }

    public String getBaronKills() {
        return baronKills;
    }

    public void setBaronKills(String baronKills) {
        this.baronKills = baronKills;
    }

    public String getVilemawKills() {
        return vilemawKills;
    }

    public void setVilemawKills(String vilemawKills) {
        this.vilemawKills = vilemawKills;
    }

    public String getRiftHeraldKills() {
        return riftHeraldKills;
    }

    public void setRiftHeraldKills(String riftHeraldKills) {
        this.riftHeraldKills = riftHeraldKills;
    }

    public String getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    public void setDominionVictoryScore(String dominionVictoryScore) {
        this.dominionVictoryScore = dominionVictoryScore;
    }


}
