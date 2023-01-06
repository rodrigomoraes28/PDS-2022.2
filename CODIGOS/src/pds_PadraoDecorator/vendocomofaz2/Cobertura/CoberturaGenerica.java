package vendocomofaz2.Cobertura;

import vendocomofaz2.Interfaces.ICobertura;
import vendocomofaz2.Interfaces.ISobremesa;

public abstract class CoberturaGenerica implements ICobertura{


  public ISobremesa sobremesa;
  public float preco;

  public CoberturaGenerica(ISobremesa sobremesa_ex){
      this.sobremesa = sobremesa_ex;
  }

  public float lePreco(){ //o metodo aq precisa ter o mesmo nome que o metodo do ISobremesa senao da merda ae nas coberturas
    return this.preco + sobremesa.lePreco();
  }
}
