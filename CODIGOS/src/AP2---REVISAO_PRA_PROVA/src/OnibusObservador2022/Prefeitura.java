public class Prefeitura implements IObservador {

  int quantidadedeViagens = 0; //idas
  @Override
  public void atualizaEstado(EstadosOnibus estadoAtual) {
    if((estadoAtual.equals(EstadosOnibus.SAIU_DA_UFC)) ||
      (estadoAtual.equals(EstadosOnibus.SAIU_DA_PRACA))){
          this.quantidadedeViagens++;
          System.out.println("Adicionou um trecho de viagem " + this.quantidadedeViagens);
    
  }
  
}

}
