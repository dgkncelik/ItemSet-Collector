import com.google.gson.Gson;

import java.util.List;

public class MatchV3byAccountId {
    private List<Matches> matches;
    private String endIndex;
    private String startIndex;
    private String totalGames;
    private String raw_result;

    public String getRaw_result() {
        return raw_result;
    }

    public void setRaw_result(String raw_result) {
        this.raw_result = raw_result;
    }



    public MatchV3byAccountId(List<Matches> matches, String endIndex, String startIndex, String totalGames) {
        this.matches = matches;
        this.endIndex = endIndex;
        this.startIndex = startIndex;
        this.totalGames = totalGames;
    }

    public MatchV3byAccountId(){

    }

    public MatchV3byAccountId send(Configuration conf, String account_id, String champion){
        WebApi request = new WebApi(conf);
        if(champion == ""){
            request.setApi_uri("/lol/match/v3/matchlists/by-account/" + account_id + "/");
        }else{
            request.setApi_uri("/lol/match/v3/matchlists/by-account/" + account_id +"/?champion=" + champion + "&");
        }
        request.send();

        Gson gson = new Gson();
        MatchV3byAccountId result = gson.fromJson(request.getResult(), MatchV3byAccountId.class);
        result.raw_result = request.getResult();
        return result;
    }

    public List<Matches> getMatches() {
        return matches;
    }

    public void setMatches(List<Matches> matches) {
        this.matches = matches;
    }

    public String getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(String endIndex) {
        this.endIndex = endIndex;
    }

    public String getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(String startIndex) {
        this.startIndex = startIndex;
    }

    public String getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(String totalGames) {
        this.totalGames = totalGames;
    }

}
