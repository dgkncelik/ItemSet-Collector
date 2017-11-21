import com.google.gson.Gson;

import java.util.HashMap;

public class StaticData {
    private Configuration conf;
    protected HashMap<String, Champion> champion_list;
    protected HashMap<String, Item> item_list;

    public StaticData(Configuration conf){
        this.conf = conf;
    }

    public void getStaticData(){
        WebApi static_data = new WebApi(conf);
        static_data.setApi_uri("/lol/static-data/v3/champions?locale=" + conf.getLocale() + "&");
        static_data.send();

        Gson gson = new Gson();
        ChampionStaticData champions = gson.fromJson(static_data.getResult(), ChampionStaticData.class);
        this.champion_list = champions.getData();
            //System.out.println(champions.getData().get(key).getId() + champions.getData().get(key).getKey() + champions.getData().get(key).getName() + champions.getData().get(key).getTitle());

        static_data.setApi_uri("/lol/static-data/v3/items?locale=" + conf.getLocale() + "&");
        static_data.send();
        ItemStaticData items = gson.fromJson(static_data.getResult(), ItemStaticData.class);
        this.item_list = items.getData();
            //System.out.println(items.getData().get(key).getId() + " " + items.getData().get(key).getName());
    }

    public HashMap<String, Champion> getChampion_list() {
        return champion_list;
    }

    public HashMap<String, Item> getItem_list() {
        return item_list;
    }

}
