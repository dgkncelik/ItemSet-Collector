import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class CreateItemSet {
    private String result;
    private String item_set_title;
    private String item_set_type;
    private String item_set_map;
    private String item_set_mode;
    private Boolean item_set_priority;
    private Integer item_set_sortrank;
    private String block_type;
    private Boolean block_recmath;
    private Integer block_min_summoner_level;
    private Integer block_max_summoner_level;
    private String block_show_if_summoner_spell;
    private String block_hide_if_summoner_spell;
    private String[] item_set_array;

    public CreateItemSet(String item_set_title, String item_set_type, String item_set_map, String item_set_mode, Boolean item_set_priority, Integer item_set_sortrank, String block_type, Boolean block_recmath, Integer block_min_summoner_level, Integer block_max_summoner_level, String block_show_if_summoner_spell, String block_hide_if_summoner_spell, String[] item_set_array) {
        this.item_set_title = item_set_title;
        this.item_set_type = item_set_type;
        this.item_set_map = item_set_map;
        this.item_set_mode = item_set_mode;
        this.item_set_priority = item_set_priority;
        this.item_set_sortrank = item_set_sortrank;
        this.block_type = block_type;
        this.block_recmath = block_recmath;
        this.block_min_summoner_level = block_min_summoner_level;
        this.block_max_summoner_level = block_max_summoner_level;
        this.block_show_if_summoner_spell = block_show_if_summoner_spell;
        this.block_hide_if_summoner_spell = block_hide_if_summoner_spell;
        this.item_set_array = item_set_array;
    }

    public void create(){
        List<ItemSetItems>  items = new ArrayList<ItemSetItems>();
        ItemSetItems items_member = new ItemSetItems();
        for(int i=0; i<this.item_set_array.length; i++) {
            items_member.setId(this.item_set_array[i]);
            items_member.setCount(1);
            items.add(items_member);
        }

        ItemSetBlocks blocks_member = new ItemSetBlocks();
        blocks_member.setType(this.block_type);
        blocks_member.setRecMath(this.block_recmath);
        blocks_member.setMinSummonerLevel(this.block_min_summoner_level);
        blocks_member.setMaxSummonerLevel(this.block_max_summoner_level);
        blocks_member.setShowIfSummonerSpell(this.block_show_if_summoner_spell);
        blocks_member.setHideIfSummonerSpell(this.block_hide_if_summoner_spell);
        blocks_member.setItems(items);

        List<ItemSetBlocks> block = new ArrayList<ItemSetBlocks>();
        block.add(blocks_member);

        ItemSet set = new ItemSet();
        set.setTitle(this.item_set_title);
        set.setType(this.item_set_type);
        set.setMap(this.item_set_map);
        set.setMode(this.item_set_mode);
        set.setPriority(this.item_set_priority);
        set.setSortrank(this.item_set_sortrank);
        set.setBlocks(block);

        this.result = new Gson().toJson(set);
    }

    public String getResult(){
        return this.result;
    }
}
