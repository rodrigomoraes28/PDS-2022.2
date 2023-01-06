package Recheios;
import Interfaces.IRecheio;
import Interfaces.ILanche;

//CoberturaGenerica seria tipo a border
public abstract class RecheioGenerico implements IRecheio{  
 

  float preco;
  ILanche lanche;  
  public RecheioGenerico(ILanche lanche_ex){
    this.lanche = lanche_ex;
  }


  public float lePreco(){
    return this.preco + lanche.lePreco();
  }


 
  
}
