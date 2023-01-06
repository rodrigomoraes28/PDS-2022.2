public class Cliente  {


  IFabrica fabrica;


  public Cliente(){
    this.fabrica = new FabricaPaulyne();
  }


  public void setFabrica(IFabrica fabrica_escolha){
    this.fabrica = fabrica_escolha;
  }


  public void lePrecoPizza(String tipo){
    this.fabrica.criarPizza(tipo).lePreco();
  }



  
}
