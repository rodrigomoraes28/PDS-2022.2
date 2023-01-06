package Questao2;

public abstract class IngredienteGenerico implements IIngredientes{

  ILanche lanche;
  float preco;


  IngredienteGenerico(ILanche lanche_ex){
    this.lanche = lanche_ex;
  }


  @Override
  public float lePreco() {
    return this.preco + lanche.lePreco();
  }

  
}
