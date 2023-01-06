public class Prefeitura implements IObservador{

  public int quantidadedeViagens = 0;
  @Override
  public void atualizaEstadoOnibus(EstadosOnibus estadoAtual) {

    if((estadoAtual.equals(EstadosOnibus.SAIU_DA_PRACA)) ||
      (estadoAtual.equals(EstadosOnibus.SAIU_DA_PRACA))){
        this.quantidadedeViagens++;
        System.out.println("Adicionou um trecho de viagem " + this.quantidadedeViagens);
      }
    }
  
}
