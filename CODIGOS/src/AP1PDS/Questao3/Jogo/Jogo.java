package Jogo;

import Interface.IArma;
import Personagens.Mago;


public class Jogo {

  /*  Levando em consideração o diagrama de comunicação e o código abaixo que mostram uma classe Mago acessando diretamente uma classe Cajado, refatore o código das classes utilizando o princípio de inversão de dependência para permitir que diferentes armas (por exemplo, cajado e anel) possam ser usados por esse mesmo Mago. 
  
  Sua resposta deve ser o código das classes (posicionadas corretamente em pacotes levando em consideração que no futuro as diferentes armas também poderão ser usadas por outros personagens) que implementa sua solução. (3 pontos)*/
  Mago mago;
  IArma arma;

  public void setPersonagem(Mago mago){
    this.mago = mago;
  }
  
  public void atacar(){
    arma.atacar();
  }

  public void TrocaArma(IArma trocaarma){
    this.arma = trocaarma;
  }

}
