package fi.solehmainen.ostoskori;

import java.util.ArrayList;

public class ItemStorage {
    private static ItemStorage itemStorage = null;

    ArrayList<Item> items = new ArrayList<>();

    private ItemStorage(){

    }

    public static ItemStorage getInstance() {
        if (itemStorage == null){
            itemStorage = new ItemStorage();
        }

        return itemStorage;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item){
        items.add(item);
        System.out.println(item);
        System.out.println(items);
    }
}
