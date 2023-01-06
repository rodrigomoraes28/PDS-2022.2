public class PizzaPaulyneFactory implements PizzaFactory {

    @Override
    public Pizza criarPizza(String tipo) {
        switch(tipo) {
            case "mussarela":
                return new MussarelaPaulyne();
            case "calabresa":
                return new CalabresaPaulyne();
            default:
                return null;
        }
    }
    
}
