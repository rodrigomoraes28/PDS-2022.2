public class Cliente {
    PizzaFactory factory;

    public Cliente(){
        this.factory = new PizzaPaulyneFactory();
    }
    
 
    public Pizza criaPizza(String tipo){
        Pizza pizza = this.factory.criarPizza(tipo); 
        return pizza;
    }

    public void setFabrica(PizzaFactory setFactory){
        this.factory = setFactory;
    }
}