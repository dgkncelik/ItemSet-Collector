import java.util.List;

public class ItemSetBlocks {
    private String type;
    private Boolean recMath;
    private Integer minSummonerLevel;
    private Integer maxSummonerLevel;
    private String showIfSummonerSpell;
    private String hideIfSummonerSpell;
    private List<ItemSetItems> items;

    public ItemSetBlocks(){

    }

    public ItemSetBlocks(String type, Boolean recMath, Integer minSummonerLevel, Integer maxSummonerLevel, String showIfSummonerSpell, String hideIfSummonerSpell, List<ItemSetItems> items) {
        this.type = type;
        this.recMath = recMath;
        this.minSummonerLevel = minSummonerLevel;
        this.maxSummonerLevel = maxSummonerLevel;
        this.showIfSummonerSpell = showIfSummonerSpell;
        this.hideIfSummonerSpell = hideIfSummonerSpell;
        this.items = items;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRecMath() {
        return recMath;
    }

    public void setRecMath(Boolean recMath) {
        this.recMath = recMath;
    }

    public Integer getMinSummonerLevel() {
        return minSummonerLevel;
    }

    public void setMinSummonerLevel(Integer minSummonerLevel) {
        this.minSummonerLevel = minSummonerLevel;
    }

    public Integer getMaxSummonerLevel() {
        return maxSummonerLevel;
    }

    public void setMaxSummonerLevel(Integer maxSummonerLevel) {
        this.maxSummonerLevel = maxSummonerLevel;
    }

    public String getShowIfSummonerSpell() {
        return showIfSummonerSpell;
    }

    public void setShowIfSummonerSpell(String showIfSummonerSpell) {
        this.showIfSummonerSpell = showIfSummonerSpell;
    }

    public String getHideIfSummonerSpell() {
        return hideIfSummonerSpell;
    }

    public void setHideIfSummonerSpell(String hideIfSummonerSpell) {
        this.hideIfSummonerSpell = hideIfSummonerSpell;
    }

    public List<ItemSetItems> getItems() {
        return items;
    }

    public void setItems(List<ItemSetItems> items) {
        this.items = items;
    }
}

