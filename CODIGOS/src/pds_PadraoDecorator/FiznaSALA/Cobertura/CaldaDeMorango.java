package Cobertura;
import Interfaces.ISorvete;


//as coberturas seriam tipo os componentes

//as interfaces sao os comportamentos e o unico comportamento é o lePreco
public class CaldaDeMorango extends CoberturaGenerica{

  public CaldaDeMorango(ISorvete sorvete_ex){
    super(sorvete_ex);
    this.preco = 1.5f;
  }
  
}
