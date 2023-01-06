package Decorator;

public abstract class CoberturaGenerica {


  ISobremesa sobremesa;
  float preco;

  CoberturaGenerica(ISobremesa sobremesa_ex){
    this.sobremesa = sobremesa_ex;

  }


  public float lePreco(){
    return this.preco + sobremesa.lePreco();
  }
  
}
