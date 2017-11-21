import java.util.HashMap;

public class Configuration {
    private String api_key;
    private String database_file;
    private String api_region_server;
    private HashMap<String, String> api_region_list;
    private String summoner_name;
    private String locale;
    private String champion_id;

    public String getChampion_id() {
        return champion_id;
    }

    public void setChampion_id(String champion_id) {
        this.champion_id = champion_id;
    }

    public String getSummoner_name() {
        return summoner_name;
    }

    public void setSummoner_name(String summoner_name) {
        this.summoner_name = summoner_name;
    }

    public HashMap<String, String> getApi_region_list() {
        return api_region_list;
    }

    public void setApi_region_list(HashMap<String, String> api_region_list) {
        this.api_region_list = api_region_list;
    }

    public String getApi_region_server() {
        return api_region_server;
    }

    public void setApi_region_server(String api_region_server) {
        this.api_region_server = api_region_server;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getDatabase_file() {
        return database_file;
    }

    public void setDatabase_file(String database_file) {
        this.database_file = database_file;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

}
