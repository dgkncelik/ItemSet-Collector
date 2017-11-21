public class RequestItemSet {
    private Configuration conf;
    private String[][] itemset_array;

    public RequestItemSet(){

    }

    public RequestItemSet(Configuration conf){
        this.conf = conf;
        String summoner_name = conf.getSummoner_name();
        String account_id;
        SummonerV3byName requestWithSummonerName = new SummonerV3byName();
        account_id = requestWithSummonerName.send(conf, summoner_name).getAccountId();

        Integer max_match_number = 5;
        MatchV3byAccountId requestWithAccountId = new MatchV3byAccountId();
        MatchV3byAccountId temp_match_list = requestWithAccountId.send(conf, account_id, conf.getChampion_id());
        if(temp_match_list.getMatches().size() < max_match_number){
            max_match_number = temp_match_list.getMatches().size();
        }
        String[] match_list = new String[max_match_number];

        for(int i=0; i<max_match_number; i++){
            match_list[i] = temp_match_list.getMatches().get(i).getGameId();
            //System.out.println("---" + match_list[i] + "---");
        }

        Integer finded_full_item_limit = 10;
        Integer empty_degree = 0;
        Integer finded_full_item = 0;
        String[][] item_list_result = new String[finded_full_item_limit][7];
        for(int j=0; j<max_match_number; j++){
            MatchV3byMatchId requestWithMatchId = new MatchV3byMatchId();
            MatchV3byMatchId temp_match_info = requestWithMatchId.send(conf, match_list[j]);
            String[] temp_item_set = new String[7];
            for(int k=0; k<10; k++){
                if(temp_match_info.getParticipantIdentities().get(k).getPlayer().getAccountId().equals(account_id)){
                    Integer participantId = temp_match_info.getParticipantIdentities().get(k).getParticipantId();
                    //System.out.println("??" + participantId);
                    temp_item_set[0] = temp_match_info.getParticipants().get(k).getStats().getItem0();
                    if(temp_item_set[0].equals("0")){
                        empty_degree++;
                    }

                    temp_item_set[1] = temp_match_info.getParticipants().get(k).getStats().getItem1();
                    if(temp_item_set[1].equals("0")){
                        empty_degree++;
                    }

                    temp_item_set[2] = temp_match_info.getParticipants().get(k).getStats().getItem2();
                    if(temp_item_set[2].equals("0")){
                        empty_degree++;
                    }

                    temp_item_set[3] = temp_match_info.getParticipants().get(k).getStats().getItem3();
                    if(temp_item_set[3].equals("0")){
                        empty_degree++;
                    }

                    temp_item_set[4] = temp_match_info.getParticipants().get(k).getStats().getItem4();
                    if(temp_item_set[4].equals("0")){
                        empty_degree++;
                    }

                    temp_item_set[5] = temp_match_info.getParticipants().get(k).getStats().getItem5();
                    if(temp_item_set[5].equals("0")){
                        empty_degree++;
                    }

                    temp_item_set[6] = temp_match_info.getParticipants().get(k).getStats().getItem6();
                    if(temp_item_set[6].equals("0")){
                        empty_degree++;
                    }

                    if(empty_degree.equals(0)){
                        item_list_result[finded_full_item][0] = temp_item_set[0];
                        item_list_result[finded_full_item][1] = temp_item_set[1];
                        item_list_result[finded_full_item][2] = temp_item_set[2];
                        item_list_result[finded_full_item][3] = temp_item_set[3];
                        item_list_result[finded_full_item][4] = temp_item_set[4];
                        item_list_result[finded_full_item][5] = temp_item_set[5];
                        item_list_result[finded_full_item][6] = temp_item_set[6];

                        finded_full_item++;
                    }

                    if(finded_full_item.equals(finded_full_item_limit)){
                        break;
                    }
                    empty_degree = 0;

                }
            }
        }
        this.itemset_array = item_list_result;
    }

    public Configuration getConf() {
        return this.conf;
    }

    public void setConf(Configuration conf) {
        this.conf = conf;
    }

    public String[][] getItemSetArray(){
        return this.itemset_array;
    }

}
