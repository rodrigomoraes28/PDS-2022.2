public class Cliente  {


  IFabrica fabrica;


  public Cliente(){
    this.fabrica = new FabricaPaulyne();
  }


  public void setFabrica(IFabrica fabrica_escolha){
    this.fabrica = fabrica_escolha;
    System.out.println("A Fabrica foi trocada por: " + fabrica_escolha.getClass().getName());
  }

  //nao entendi mt bem isso aqui nao
  public IPizza clienteCriarPizza(String tipo){
    IPizza pizza = this.fabrica.criarPizza(tipo);
    return pizza;
  }
 
  
}
