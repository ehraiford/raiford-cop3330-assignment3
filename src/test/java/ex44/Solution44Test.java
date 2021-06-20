package ex44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution44Test {

    @Test
    void findIndex_returns_negative1_when_item_is_not_in_list(){
        Inventory instance = new Inventory();
        Product item = new Product();
        item.setPrice(300);
        item.setName("Switch");
        item.setQuantity(2L);
        instance.addProduct(item);
        Product second = new Product();
        second.setPrice(500);
        second.setName("PlayStation 5");
        second.setQuantity(15L);
        instance.addProduct(second);
        Product third = new Product();
        third.setPrice(1499);
        third.setQuantity(0L);
        third.setName("RTX 3090");
        instance.addProduct(third);

        assertTrue(Solution44.findIndex("Xbox", instance.getIndex()) == -1);
    }

    @Test
    void findIndex_returns_spot_when_item_is_in_list() {
        Inventory instance = new Inventory();
        Product item = new Product();
        item.setPrice(300);
        item.setName("Switch");
        item.setQuantity(2L);
        instance.addProduct(item);
        Product second = new Product();
        second.setPrice(500);
        second.setName("PlayStation 5");
        second.setQuantity(15L);
        instance.addProduct(second);
        Product third = new Product();
        third.setPrice(1499);
        third.setQuantity(0L);
        third.setName("RTX 3090");
        instance.addProduct(third);

        assertTrue(Solution44.findIndex("PlayStation 5", instance.getIndex()) == 1);
    }
}