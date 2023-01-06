public class GuerreirosdePedra implements IObservavel{

  @Override
  public void atualizaEstado(boolean estadoSerpente) {

    if(estadoSerpente == true){
      System.out.println("Nada Acontece");
    }
    else{
      System.out.println("Guerreiros de Pedra, a SERPENTE MORREU!!!!!");
    }    
  }

}