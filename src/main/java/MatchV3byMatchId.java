import com.google.gson.Gson;

import java.util.List;

public class MatchV3byMatchId {
    private List<Teams> teams;
    private List<Participants> participants;
    private List<ParticipantIdentities> participantIdentities;
    private String gameId;
    private String platformId;
    private String gameCreation;
    private String gameDuration;
    private String queueId;
    private String mapId;
    private String seasonId;
    private String gameVersion;
    private String gameMode;
    private String gameType;

    public MatchV3byMatchId(List<Teams> teams, List<Participants> participants, List<ParticipantIdentities> participantIdentities, String gameId, String platformId, String gameCreation, String gameDuration, String queueId, String mapId, String seasonId, String gameVersion, String gameMode, String gameType, String raw_result) {
        this.teams = teams;
        this.participants = participants;
        this.participantIdentities = participantIdentities;
        this.gameId = gameId;
        this.platformId = platformId;
        this.gameCreation = gameCreation;
        this.gameDuration = gameDuration;
        this.queueId = queueId;
        this.mapId = mapId;
        this.seasonId = seasonId;
        this.gameVersion = gameVersion;
        this.gameMode = gameMode;
        this.gameType = gameType;
        this.raw_result = raw_result;
    }

    public List<ParticipantIdentities> getParticipantIdentities() {
        return participantIdentities;
    }

    public void setParticipantIdentities(List<ParticipantIdentities> participantIdentities) {
        this.participantIdentities = participantIdentities;
    }

    public List<Teams> getTeams() {
        return teams;
    }

    public void setTeams(List<Teams> teams) {
        this.teams = teams;
    }


    public List<Participants> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participants> participants) {
        this.participants = participants;
    }


    private String raw_result;

    public String getRaw_result() {
        return raw_result;
    }

    public void setRaw_result(String raw_result) {
        this.raw_result = raw_result;
    }


    public MatchV3byMatchId(){

    }

    public MatchV3byMatchId send(Configuration conf, String match_id){
        WebApi request = new WebApi(conf);
        request.setApi_uri("/lol/match/v3/matches/" + match_id + "/");
        request.send();
        //ERROR EXCEPTION HANDLING

        Gson gson = new Gson();
        MatchV3byMatchId result = gson.fromJson(request.getResult(), MatchV3byMatchId.class);
        result.raw_result = request.getResult();
        return result;
    }


}
