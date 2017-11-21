import com.google.gson.Gson;

public class SummonerV3byName {

    private String id;
    private String accountId;
    private String name;
    private String profileIconId;
    private String revisionDate;
    private String summonerLevel;
    private String raw_result;

    public String getRaw_result() {
        return raw_result;
    }

    public void setRaw_result(String raw_result) {
        this.raw_result = raw_result;
    }



    public String getId() {
        return id;
    }
    public SummonerV3byName(){

    }
    public SummonerV3byName(String id, String accountId, String name, String profileIconId, String revisionDate, String summonerLevel) {
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.profileIconId = profileIconId;
        this.revisionDate = revisionDate;
        this.summonerLevel = summonerLevel;
    }

    public SummonerV3byName send(Configuration conf, String summoner_name){
        WebApi request = new WebApi(conf);
        request.setApi_uri("/lol/summoner/v3/summoners/by-name/" + summoner_name + "/");
        request.send();
        //ERROR EXCEPTION HANDLING

        Gson gson = new Gson();
        SummonerV3byName result = gson.fromJson(request.getResult(), SummonerV3byName.class);
        result.raw_result = request.getResult();
        return result;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(String profileIconId) {
        this.profileIconId = profileIconId;
    }

    public String getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(String revisionDate) {
        this.revisionDate = revisionDate;
    }

    public String getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(String summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public String getAccountId() {
        return accountId;
    }

    @Override
    public String toString(){
        return accountId;
    }
}
