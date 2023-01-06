public class ExemplodeUso {

  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
  }


  public void inicia(){

    IFabrica fabrica = new FabricaPaulyne();
    fabrica.criaPizza("mussarela");
    
    // Cliente cliente = new Cliente();
    // System.out.println(cliente.pedirPizza("mussarela"));
    

  }
  
}
