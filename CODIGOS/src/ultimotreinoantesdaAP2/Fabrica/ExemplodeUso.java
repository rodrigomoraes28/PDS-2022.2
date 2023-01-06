public class ExemplodeUso {


  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();

    exemplodeUso.inicia();
  }

  public void inicia(){

    Cliente cliente = new Cliente();
    System.out.println("Preçod a pizza de mussarela" + cliente.pedirPizza("mussarlea"));

    IFabrica fabrica2 = new FabricaPaulyne(); //se tivesse outra por exemplo
    cliente.setFabrica(fabrica2);

  }
  
}
