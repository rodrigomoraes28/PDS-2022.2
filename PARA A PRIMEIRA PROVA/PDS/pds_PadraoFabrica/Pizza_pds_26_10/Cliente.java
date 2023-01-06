public class Cliente {
    PizzaFactory factory;

    public Cliente(){
        factory = new PizzaPaulyneFactory();
    }
    
    
    public Pizza criaPizza(String tipo){
        Pizza pizza = factory.criarPizza(tipo);
        
        return pizza;
    }
}