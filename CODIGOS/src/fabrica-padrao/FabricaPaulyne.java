public class FabricaPaulyne implements IFabrica{

  @Override
  public IPizza criaPizza(String nome) {
    switch(nome){
      case "mussarela": return new Mussarela();
      case "portuguesa": return new Portuguesa();
      case "calabresa": return new Calabresa();
      default:
      return new Mussarela(); 
    }
    
  }
  
}
