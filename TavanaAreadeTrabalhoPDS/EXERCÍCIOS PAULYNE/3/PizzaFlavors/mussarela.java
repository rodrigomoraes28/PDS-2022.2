package PizzaFlavors;

public class mussarela implements IPizza{
    @Override
    public int getCalories() {
        return 1200;
    }

    @Override
    public String getFlavor() {
        return "mussarela";
    }
}
