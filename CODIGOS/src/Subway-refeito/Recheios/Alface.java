package Recheios;
import Interfaces.ILanche;


//as coberturas seriam tipo os componentes

//as interfaces sao os comportamentos e o unico comportamento é o lePreco
public class Alface extends RecheioGenerico{

  public Alface(ILanche lanche_ex){
    super(lanche_ex);
    this.preco = 2f;
  }
  
}
