package Armas;

import Interface.IArma;

public class Cajado implements IArma{

  public int dano;  
  public void atacar(){
    this.dano = 7;
    System.out.println("O dano do cajado é:" + dano);
  }
 

}
