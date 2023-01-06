package PizzaFactory;

import PizzaFlavors.IPizza;
import PizzaFlavors.portuguesa;

public class portuguesaFactory implements IPizzaFactory{
    @Override
    public IPizza create_pizza() {
        return new portuguesa();
    }
}
