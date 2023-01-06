package Questao03;

public class EspadaCurta implements IEspada {

  int dano = 50;

  EspadaCurta(int dano_ex){
    this.dano = dano_ex;
  }

  @Override
  public int leDano() {
    return dano;
  }
  
}
