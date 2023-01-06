package Cobertura;
import Interfaces.ISorvete;


//as coberturas seriam tipo os componentes

//as interfaces sao os comportamentos e o unico comportamento é o lePreco
public class CaldaDeChocolate extends CoberturaGenerica{

  public CaldaDeChocolate(ISorvete sorvete_ex){
    super(sorvete_ex);
    this.preco = 1.0f;
  }
  
}
