public class ItemSetItems {
    private String id;
    private Integer count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ItemSetItems(String id, Integer count) {
        this.id = id;
        this.count = count;
    }

    public ItemSetItems(){

    }
}
