public abstract class RecheioGenerico implements IRecheio{

  ISobremesa sobremesa;
  float preco;

  public RecheioGenerico(ISobremesa sobremesa_ex){
    this.sobremesa = sobremesa_ex;
  }


  public float lePreco(){
    return this.preco + this.sobremesa.lePreco();
  }
  
}
