package Observer2;

public class Prefeitura implements IObserver {


  int viagens;

  @Override
  public void atualizaEstado(EstadosOnibus estados) {

    if(estados.equals(EstadosOnibus.SAIU_DA_PRACA) || (estados.equals(EstadosOnibus.SAIU_DA_UFC)))
    {
      viagens++;
      System.out.println("Total de viagens:" + this.viagens);
    }
     
  }
  
}
