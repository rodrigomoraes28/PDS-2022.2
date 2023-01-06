public class Aluno implements IObservador {
 

  @Override
  public void atualizaEstadoOnibus(EstadosOnibus estadoAtual) {
    if(estadoAtual.equals(EstadosOnibus.CHEGOU_NA_UFC)){
      System.out.println("CORRE POVO!");
    }    
  }
  
}
