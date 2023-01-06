package Strategy;

import Product.Product;

import java.util.ArrayList;

public interface IStrategy {

    public float getShipmentPrice(ArrayList<Product> products);

}
