package Recheios;
import Interfaces.ILanche;


//as coberturas seriam tipo os componentes

//as interfaces sao os comportamentos e o unico comportamento é o lePreco
public class QueijoMussarela extends RecheioGenerico{

  public QueijoMussarela(ILanche lanche_ex){
    super(lanche_ex);
    this.preco = 5.0f;
  }
  
}
