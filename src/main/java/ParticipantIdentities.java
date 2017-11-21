public class ParticipantIdentities {
    private Integer participantId;
    private Player player;

    public ParticipantIdentities(Integer participantId, Player player) {
        this.participantId = participantId;
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }
}
