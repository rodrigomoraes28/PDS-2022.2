package Observer2;

public class Aluno  implements IObserver{

  @Override
  public void atualizaEstado(EstadosOnibus estados) 
  {

    if(estados.equals(EstadosOnibus.CHEGOU_NA_UFC) || (estados.equals(EstadosOnibus.CHEGOU_NA_PRACA)))
    {
       System.out.println("CORRE POVO");
    }
     
  }
  
}
