package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        if (item1.getPrice() > item2.getPrice()) {
            return 1;
        } else if (Objects.equals(item1.getPrice(), item2.getPrice())) {
            return 0;
        }
        return -1;
    }
}
