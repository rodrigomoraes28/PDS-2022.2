package Strategy;

import Product.Product;

import java.util.ArrayList;

public class SEDEX implements IStrategy{
    @Override
    public float getShipmentPrice(ArrayList<Product> products) {
        int totalWeight =0;

        for(Product p:products)
            totalWeight+=p.getWeight();

        return totalWeight*0.5f;
    }
}
