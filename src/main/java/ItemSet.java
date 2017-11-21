import java.util.List;

public class ItemSet {
    private String title;
    private String type;
    private String map;
    private String mode;
    private Boolean priority;
    private Integer sortrank;
    private List<ItemSetBlocks> blocks;

    public ItemSet(){

    }

    public ItemSet(String title, String type, String map, String mode, Boolean priority, Integer sortrank, List<ItemSetBlocks> blocks) {
        this.title = title;
        this.type = type;
        this.map = map;
        this.mode = mode;
        this.priority = priority;
        this.sortrank = sortrank;
        this.blocks = blocks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Boolean getPriority() {
        return priority;
    }

    public void setPriority(Boolean priority) {
        this.priority = priority;
    }

    public Integer getSortrank() {
        return sortrank;
    }

    public void setSortrank(Integer sortrank) {
        this.sortrank = sortrank;
    }

    public List<ItemSetBlocks> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<ItemSetBlocks> blocks) {
        this.blocks = blocks;
    }
}
