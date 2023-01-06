public abstract class RecheioGenerico implements IRecheio {

  ILanche lanche;
  float preco;

  RecheioGenerico(ILanche lanche_ex){
    this.lanche = lanche_ex;
  }


  public float lePreco(){
    return this.preco + lanche.lePreco();
  }
  
  
}
