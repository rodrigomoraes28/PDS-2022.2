public class Guerreira implements IObservavel{

  @Override
  public void atualizaEstado(boolean estadoSerpente) {
    if(estadoSerpente == true){
      System.out.println("Nada Acontece");
    }
    else{
      System.out.println("Corre Guerreira, a serpente morreu");
    }
    
  }



  
} 