package rocks.zipcode.io;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        if (items == null || items.length == 0) {
            return new Item[0];
        }

        for (int i = 0; i < items.length -1; i++) {
            int minNum = i;
            for (int j = i + 1; j < items.length; j++) {
                if (comparator.compare(items[j], items[minNum]) < 0) {
                    minNum = j;
                }
            }
            Item temp = items[minNum];
            items[minNum] = items[i];
            items[i] = temp;
        }
        return items;
    }
}
