package PizzaFactory;

import PizzaFlavors.IPizza;
import PizzaFlavors.mussarela;

public class mussarelaFactory implements IPizzaFactory{

    @Override
    public IPizza create_pizza() {
        return new mussarela();
    }
}
