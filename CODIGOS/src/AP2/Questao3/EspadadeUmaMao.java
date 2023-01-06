package Questao3;

public class EspadadeUmaMao implements IEspada, IEscolha {

 
  @Override
  public int escolheEspada(IEspada espada) {
    return espada.leDano(50);
  }
  
  
  @Override
  public int leDano(int dano) {
    return 50;
  }
  
}
