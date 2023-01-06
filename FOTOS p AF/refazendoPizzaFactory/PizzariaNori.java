public class PizzariaNori implements IFabrica{

  @Override
  public IPizza criaPizza(String tipo) {
    switch(tipo){
      case "Mussarela" : return new MussarelaNori();
      case "Frango" : return new FrangoNori();
      default:
      System.out.println("Voce nao escolheu corretamente, entao enviaremos uma pizza padrao q eh a de mussarela");
        return new MussarelaNori();
    }
   }
  
}
