public class PizzaNoriFactory implements PizzaFactory {

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
