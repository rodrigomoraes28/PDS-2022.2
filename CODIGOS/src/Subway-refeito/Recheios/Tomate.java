package Recheios;
import Interfaces.ILanche;


//as coberturas seriam tipo os componentes

//as interfaces sao os comportamentos e o unico comportamento é o lePreco
public class Tomate extends RecheioGenerico{

  public Tomate(ILanche lanche_ex){
    super(lanche_ex);
    this.preco = 3.0f;
  }
  
}
