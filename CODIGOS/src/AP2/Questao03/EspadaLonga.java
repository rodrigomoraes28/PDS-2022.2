package Questao03;

public class EspadaLonga implements IEspada{


  int dano = 100;

  EspadaLonga(int dano_ex){
    this.dano = dano_ex;
  }

  @Override
  public int leDano() {
    return dano;
  }

  

}
