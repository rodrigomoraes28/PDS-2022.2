public class FabricaNori implements IFabrica{

  @Override
  public IPizza criarPizza(String tipo) {

     //tem que decorar esse bagulho aqui do switch
    switch(tipo){
      case "mussarela":
        return new PizzaMussarrelaNori();
      case "calabresa":
        return new  PizzaCalabresaNori();
      case "frango":
        return new PizzaFrangoNori();
      default:
        // poderia ter o return null;
        //ou teria q retonrar algum objeto?
      return new PizzaMussarrelaNori();
 
    }
    
  }
  
}
