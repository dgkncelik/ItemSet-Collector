import java.util.HashMap;

public class ChampionStaticData {
    private HashMap<String, Champion> data;
    private String type;
    private String version;

    public ChampionStaticData(HashMap<String, Champion> data, String type, String version) {
        this.data = data;
        this.type = type;
        this.version = version;
    }

    public HashMap<String, Champion> getData() {
        return data;
    }

    public void setData(HashMap<String, Champion> data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


}
