public class Prefeitura implements IObservador {

  int qtdViagens = 0;

  @Override
  public void atualizaEstado(EstadosOnibus estadoAtual) {
   if((estadoAtual.equals(EstadosOnibus.SAIU_DA_PRACA))
   || (estadoAtual.equals(EstadosOnibus.SAIU_DA_UFC))){
      qtdViagens++;
      System.out.println("Onibus teve " + this.qtdViagens + "viagens");
   }

  }
  
}
