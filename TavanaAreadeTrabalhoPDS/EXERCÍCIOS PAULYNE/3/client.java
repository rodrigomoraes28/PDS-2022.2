import PizzaFactory.IPizzaFactory;
import PizzaFactory.calabresaFactory;
import PizzaFactory.mussarelaFactory;
import PizzaFlavors.IPizza;

public class client {
    public static void main(String[] args) {

        IPizzaFactory pizzaFactory;
        IPizza pizza;

        pizzaFactory = new mussarelaFactory();
        pizza = pizzaFactory.create_pizza();

        System.out.println("Essa pizza de " + pizza.getFlavor() + " tem " + pizza.getCalories() + ", é muito gordurosa :(");

        pizzaFactory = new calabresaFactory();
        pizza = pizzaFactory.create_pizza();

        System.out.println("Gostei dessa pizza de " + pizza.getFlavor() + " :)");

    }
}
