package PizzaFactory;

import PizzaFlavors.IPizza;
import PizzaFlavors.calabresa;

public class calabresaFactory implements IPizzaFactory{
    @Override
    public IPizza create_pizza() {
        return new calabresa();
    }
}
