public class ExemplodeUso {


  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();

  }


  public void inicia(){

    IFabrica fabrica = new FabricaNori();


    Cliente cliente = new Cliente();

    System.out.println(cliente.criaPizza("mussarela").lePreco());

    cliente.setFabrica(fabrica);
    System.out.println(cliente.criaPizza("mussarela").lePreco());


  
  

  }
  
}
