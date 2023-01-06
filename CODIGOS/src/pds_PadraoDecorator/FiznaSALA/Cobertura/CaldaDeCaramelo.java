package Cobertura;
import Interfaces.ISorvete;


//as coberturas seriam tipo os componentes

//as interfaces sao os comportamentos e o unico comportamento é o lePreco
public class CaldaDeCaramelo extends CoberturaGenerica{

  public CaldaDeCaramelo(ISorvete sorvete_ex){
    super(sorvete_ex);
    this.preco = 2.0f;
  }
  
}
