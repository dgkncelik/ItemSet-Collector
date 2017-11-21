import java.util.HashMap;

public class Main {
    public static void main(String[] args){
      /*  Configuration conf = new Configuration();
        String[] region_list = new String[11];
        region_list[0] = "RU";
        region_list[1] = "KR";
        region_list[2] = "BR1";
        region_list[3] = "OC1";
        region_list[4] = "JP1";
        region_list[5] = "NA1";
        region_list[6] = "EUN1";
        region_list[7] = "EUW1";
        region_list[8] = "TR1";
        region_list[9] = "LA1";
        region_list[10] = "LA2";
        conf.setApi_region_list(region_list);

        */
        Configuration conf = new Configuration();
        conf.setApi_key("********");
        conf.setApi_region_server("https://br1.api.riotgames.com");
        conf.setSummoner_name("Faker");
        conf.setLocale("tr_TR");
        HashMap<String, String> region_list = new HashMap<String, String>();
            region_list.put("RU", "https://ru.api.riotgames.com");
            region_list.put("KR", "https://kr.api.riotgames.com");
            region_list.put("BR1","https://br1.api.riotgames.com");
            region_list.put("OC1","https://oc1.api.riotgames.com");
            region_list.put("JP1","https://jp1.api.riotgames.com");
            region_list.put("NA1","https://na1.api.riotgames.com");
            region_list.put("EUN1","https://eun1.api.riotgames.com");
            region_list.put("EUW1","https://euw1.api.riotgames.com");
            region_list.put("TR1","https://tr1.api.riotgames.com");
            region_list.put("LA1","https://la1.api.riotgames.com");
            region_list.put("LA2","https://la2.api.riotgames.com");
        conf.setApi_region_list(region_list);
        UserGui.main(conf);
        //UserInterface.main();

        StaticData static_data = new StaticData(conf);
        static_data.getStaticData();
        for(String key : static_data.getChampion_list().keySet()) {
            System.out.println(static_data.getChampion_list().get(key).getName());
        }
        //System.out.println(static_data.getItem_list().get("1001").getName());
        //System.out.println("--" + Arrays.deepToString(new RequestItemSet(conf).getItemSetArray()) + "--"); */
    }
}
