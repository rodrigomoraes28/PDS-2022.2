public class Cliente implements IObservador {

  @Override
  public void atualiza(boolean estadoFornada) {
    if(estadoFornada == true){
      System.out.println("Fornada ta Pronta!!!");
    }
    
  }


  
}
