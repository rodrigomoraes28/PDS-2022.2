public class ExemplodeUso {
  
  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
  }

  public void inicia(){

    Cliente cliente = new Cliente();
    Padaria padaria = new Padaria();

    
    padaria.adicionaObservador(cliente);
    padaria.setEstado(true);
    

  }
}
