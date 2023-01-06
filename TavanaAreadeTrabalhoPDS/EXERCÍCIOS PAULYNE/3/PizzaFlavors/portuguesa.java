package PizzaFlavors;

public class portuguesa implements IPizza{
    @Override
    public int getCalories() {
        return 1500;
    }

    @Override
    public String getFlavor() {
        return "portuguesa";
    }
}
