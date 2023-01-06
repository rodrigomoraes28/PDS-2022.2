public class FabricaPaulyne implements IFabrica {

  @Override
  public IPizza criaPizza(String tipo) {

    switch(tipo){
      case "mussarela" : return new Mussarela();
      case "calabresa" : return new Calabresa();
      case "portuguesa" : return new Portuguesa();
      default:
        return new Mussarela();
    }
    
    
  }
  
}
