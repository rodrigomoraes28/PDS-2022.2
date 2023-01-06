public class Garagem implements IObservador{

  int dias_de_viagem = 0;
  @Override
  public void atualizaEstado(EstadosOnibus estadoAtual) {
    if(estadoAtual.equals(EstadosOnibus.CHEGOU_NA_GARAGEM)){
        this.dias_de_viagem++;
        System.out.println("Dias de Viagem: " + dias_de_viagem);
    } 
    
  }
  
}
