public class ExemplodeUso {

  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
  }


  public void inicia(){


    Cliente cliente = new Cliente();


    cliente.lePrecoPizza("Mussarela");
    // String lePreco = 
   
    // cliente.lePrecoPizza("Mussarela");

    FabricaNori fabricaNori = new FabricaNori();
    cliente.setFabrica(fabricaNori);
    cliente.lePrecoPizza("Mussarela");




  }
  
}
