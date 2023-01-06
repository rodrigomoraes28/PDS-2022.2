public abstract class MisturaGenerica implements IMistura{


  ISorvete bebida;
  int preco;

  public MisturaGenerica(ISorvete bebida_ex){
    this.bebida = bebida_ex;
  }


  public int lePreco(){
    return this.preco + bebida.lePreco();
  }
  
}
