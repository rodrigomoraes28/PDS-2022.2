import Product.Product;
import Strategy.IStrategy;
import Strategy.PAC;
import Strategy.SEDEX;

import java.util.ArrayList;

public class client {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(100));
        products.add(new Product(30));
        products.add(new Product(20));

        IStrategy strategy = new PAC();
        System.out.println("Price using PAC delivery: " + strategy.getShipmentPrice(products));

        strategy = new SEDEX();
        System.out.println("Price using SEDEX delivery: " + strategy.getShipmentPrice(products));
    }
}
