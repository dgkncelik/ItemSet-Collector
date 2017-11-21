import java.util.HashMap;

public class ItemStaticData {
    private HashMap<String, Item> data;
    private String type;
    private String version;

    public ItemStaticData(HashMap<String, Item> data, String type, String version) {
        this.data = data;
        this.type = type;
        this.version = version;
    }

    public HashMap<String, Item> getData() {
        return data;
    }

    public void setData(HashMap<String, Item> data) {
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
