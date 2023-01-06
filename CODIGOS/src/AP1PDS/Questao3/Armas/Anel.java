package Armas;

import Interface.IArma;

public class Anel implements IArma{
  
  public int dano;  
  public void atacar(){
    dano = 3;
    System.out.println("O dano do anel é:" + dano);
  }
}
