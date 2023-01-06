public class FabricaLanche implements IFabrica{

  @Override
  public ILanche criaLanche(String tipo) {
   switch(tipo){

    case "PaoFrances" :return new PaoFrances();
    case "Baguete" : return new Baguete();

    default:
    System.out.println( "Escolha uma opção valida: PaoFrances, ou, Baguete");
    return null;

   }
   }
  
}
