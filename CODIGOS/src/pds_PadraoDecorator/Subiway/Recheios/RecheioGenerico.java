package Subiway.Recheios;

import Subiway.Interfaces.ILanche;
import Subiway.Interfaces.IRecheio;

public abstract class RecheioGenerico implements IRecheio{

  ILanche lanche;
  float preco;

  public RecheioGenerico(ILanche lanche_ex){
    this.lanche = lanche_ex;
  }


  public float lePreco(){
    return this.preco + lanche.lePreco();
  }
  
}
