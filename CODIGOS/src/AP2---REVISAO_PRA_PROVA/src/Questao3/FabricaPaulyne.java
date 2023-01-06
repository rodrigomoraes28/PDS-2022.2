public class FabricaPaulyne implements IFabrica{

  @Override
  public IPizza criarPizza(String tipo) {

     //tem que decorar esse bagulho aqui do switch
    switch(tipo){
      case "mussarela":
        return new PizzaMussarelaPaulyne();
      case "calabresa":
        return new  PizzaCalabresaPaulyne();
      case "frango":
        return new PizzaFrangoPaulyne();
      default:
        // poderia ter o return null;
        //ou teria q retonrar algum objeto?
      return new PizzaMussarelaPaulyne();

    }
    
  }
  
}
