public class Cliente {

  IFabrica fabrica;

  public Cliente(){
    fabrica = new FabricaPaulyne();
  }

  public void setFabrica(IFabrica fabrica_set){
    this.fabrica = fabrica_set;
  }

  public float pedirPizza(String nome){
    return fabrica.criaPizza(nome).lePreco();
  }
  
}
