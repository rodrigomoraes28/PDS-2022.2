public class Cliente implements IFabrica{


  IFabrica fabrica;

  Cliente(){
    this.fabrica = new FabricaPaulyne();
  }


  public void setFabrica(IFabrica fabricaNova){
    this.fabrica = fabricaNova;
    System.out.println("mudou a fabrica para " + this.fabrica.getClass().getSimpleName());
  }

  //testando novo
  @Override
  public IPizza criaPizza(String tipo) {
    return this.fabrica.criaPizza(tipo);
  }


  
  
}
