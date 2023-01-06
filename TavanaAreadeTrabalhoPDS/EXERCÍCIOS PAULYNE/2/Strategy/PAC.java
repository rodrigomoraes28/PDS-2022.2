package Strategy;

import Product.Product;

import java.util.ArrayList;

public class PAC implements IStrategy{
    @Override
    public float getShipmentPrice(ArrayList<Product> products) {
        return 25;
    }
}
