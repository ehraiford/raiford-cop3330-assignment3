package ex44;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> index = new ArrayList<>();

    public void addProduct(Product item){
        index.add(item);
    }
    public ArrayList<Product> getIndex() {
        return index;
    }
}
