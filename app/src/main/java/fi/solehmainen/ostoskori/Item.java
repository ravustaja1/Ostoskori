package fi.solehmainen.ostoskori;

import java.io.Serializable;

public class Item implements Serializable {

    private String purchase;

    private int image, image2;
    public Item(String purchase) {
        this.purchase = purchase;
        this.image = R.drawable.baseline_delete_forever_24;
        this.image2 = R.drawable.baseline_edit_24;

    }

    public String getPurchase() {
        return purchase;
    }

    public int getImage() {
        return image;
    }

    public int getImage2() {
        return image2;
    }
}