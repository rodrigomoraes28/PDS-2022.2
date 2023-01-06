public class FabricaPaulyne implements IFabrica{

  @Override
  public IPizza criaPizza(String tipo) {

    switch(tipo){
      case "calabresa":
        return new CalabresaPaulyne();
      case "mussarela":
        return new MussarelaPaulyne();
      case "portuguesa":
        return new PortuguesaPaulyne();
      default:
        return new MussarelaPaulyne();      
    }
     
   
  }



  
}
