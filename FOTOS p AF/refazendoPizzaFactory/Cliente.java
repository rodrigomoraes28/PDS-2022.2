public class Cliente {

  IFabrica fabrica;
  IPizza pizza;


  public Cliente(IFabrica fabrica_padrao){
    this.fabrica = fabrica_padrao;
  }


  public void setFabrica(IFabrica fabrica_nova){
    this.fabrica = fabrica_nova;
  }
 
 
  
}
