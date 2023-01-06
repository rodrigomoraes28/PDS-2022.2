package PizzaFlavors;

public class calabresa implements IPizza{
    @Override
    public int getCalories() {
        return 1000;
    }

    @Override
    public String getFlavor() {
        return "calabresa";
    }
}
