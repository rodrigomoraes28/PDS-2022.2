public class Aluno implements IObservador {

  @Override
  public void atualizaEstado(EstadosOnibus estadoAtual) {
    if(estadoAtual.equals(EstadosOnibus.CHEGOU_NA_UFC)){ //botou essse pq eh o unico que interessa mas poderia ter outros tambem
      System.out.println("Corre povo!!!");
    }    
  } 
  
}
