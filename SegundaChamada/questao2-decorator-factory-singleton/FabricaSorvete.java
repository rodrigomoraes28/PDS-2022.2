public class FabricaSorvete implements IFabrica{

  @Override
  public ISorvete criaISorvete(String tipo) {

    switch(tipo){

      case "Leite": return new Leite();
      case "SemLactose": return new LeiteSemLactose();
      default:
      System.out.println("Voce so pode escolher 2 sabores: \n 1- Leite \n 2- SemLactose");
        return null;

    }
   }
  
}