public class App {
  
  public static void main(String[] args) {
    

    Cliente cliente = new Cliente();
    System.out.println("O Preço da pizza de mussarela é: " + cliente.criaPizza("mussarela").lePreco());


    PizzaNoriFactory pizzaNoriFactory1 = PizzaNoriFactory.getInstance();
    cliente.setFabrica(pizzaNoriFactory1);


    // System.out.println(cliente.criaPizza("mussarela").lePreco());
    
    System.out.println("O Preço da pizza de mussarela é: " + pizzaNoriFactory1.criarPizza("mussarela").lePreco());

    PizzaNoriFactory pizzanorifactory2 = PizzaNoriFactory.getInstance();
    System.out.println(pizzaNoriFactory1.getInstance());
    System.out.println(pizzanorifactory2.getInstance());
    


    //CalabresaNori calabresanori = new CalabresaNori();
   // System.out.println("Preço: " + calabresanori.lePreco());
  
  }
}
