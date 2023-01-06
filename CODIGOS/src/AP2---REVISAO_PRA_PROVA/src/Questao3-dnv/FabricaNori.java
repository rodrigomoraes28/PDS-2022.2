public class FabricaNori implements IFabrica{

  @Override
  public IPizza criaPizza(String tipo) {

    switch(tipo){
      case "calabresa":
        return new CalabresaNori();
      case "mussarela":
        return new MussarelaNori();
      case "portuguesa":
        return new PortuguesaNori();
      default:
        return new MussarelaNori();      
    }
     
   
  }



  
}
