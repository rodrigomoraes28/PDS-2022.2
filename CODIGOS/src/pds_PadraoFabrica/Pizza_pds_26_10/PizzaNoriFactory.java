public class PizzaNoriFactory implements PizzaFactory {


    private static PizzaNoriFactory uniqueInstance;

    PizzaNoriFactory(){}

    public static PizzaNoriFactory getInstance(){ //o getInstance parece ser reservado do java
        if(uniqueInstance == null){
            uniqueInstance = new PizzaNoriFactory();
        }
        return uniqueInstance;
    }

    @Override
    public Pizza criarPizza(String tipo) {
        switch(tipo) {
            case "mussarela":
                return new MussarelaNori();
            case "calabresa":
                return new CalabresaNori();
            default:
                return null;
        }
    }
    
}
