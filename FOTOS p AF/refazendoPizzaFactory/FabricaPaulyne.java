public class FabricaPaulyne implements IFabrica{

  @Override
  public IPizza criaPizza(String tipo) {
    switch(tipo){
      case "Mussarela" : return new MussarelaPaulyne();
      case "Frango" : return new FrangoPaulyne();
      default:
      System.out.println("Voce nao escolheu corretamente, entao enviaremos uma pizza padrao q eh a de mussarela");
      return new MussarelaPaulyne();
    }
   }
  
}
