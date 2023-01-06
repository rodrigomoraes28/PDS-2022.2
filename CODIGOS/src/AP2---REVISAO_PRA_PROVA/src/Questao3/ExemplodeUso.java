public class ExemplodeUso {

  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
  }


  public void inicia(){


    Cliente cliente = new Cliente();
 
    System.out.println(cliente.clienteCriarPizza("mussarela").lePreco());

    FabricaNori fabricaNori = new FabricaNori();
    cliente.setFabrica(fabricaNori);
    
    System.out.println(cliente.clienteCriarPizza("mussarela").lePreco());





  }
  
}
