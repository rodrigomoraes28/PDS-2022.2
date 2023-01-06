public class Aluno implements IObservador {

  @Override
  public void atualizaEstado(EstadosOnibus estadoAtual) {
    if(estadoAtual.equals(EstadosOnibus.CHEGOU_NA_UFC)){
      System.out.println("CORRE POVO!!!");
    }
    
  }
  
}
