public class Prefeitura implements IObservador {

  int qtd_viagens = 0;
  @Override
  public void atualizaEstado(EstadosOnibus estadoAtual) {
    if((estadoAtual.equals(EstadosOnibus.SAIU_DA_PRACA))||
      (estadoAtual.equals(EstadosOnibus.SAIU_DA_UFC))){ //detalhe nessa parte do if
       this.qtd_viagens++;
      System.out.println("Quantidade de viagens " + qtd_viagens);
    }
     
  }
  
}
 