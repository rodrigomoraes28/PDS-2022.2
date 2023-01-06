public class Cliente {


  IFabrica fabrica;


  Cliente(){
      this.fabrica = new FabricaPaulyne();
  }


  public void setFabrica(IFabrica fabrica) {
    this.fabrica = fabrica;
  }

  public float pedirPizza(String tipo){
    return fabrica.criaPizza(tipo).lePreco();
  }
  
  
}
