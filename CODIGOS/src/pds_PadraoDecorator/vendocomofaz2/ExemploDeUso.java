package vendocomofaz2;

import vendocomofaz2.Base.SorveteMisto;
import vendocomofaz2.Cobertura.CaldaDeChocolate;
import vendocomofaz2.Cobertura.CanudoWaferBiju;
import vendocomofaz2.Cobertura.Chantily;
import vendocomofaz2.Cobertura.Ovomaltine;
import vendocomofaz2.Interfaces.ISobremesa;

public class ExemploDeUso {

  public static void main(String[] args) {
    
    ExemploDeUso exemplo = new ExemploDeUso();

    exemplo.inicia();
  }

  public void inicia(){


    ISobremesa sorvetemisto = new SorveteMisto();
    System.out.println("Esse é o preço da base do sorvete: " + sorvetemisto.lePreco());

    ISobremesa chantily = new Chantily(sorvetemisto);
    System.out.println("Esse é o preço da base do sorvete + o preço da cobertura de Chaintily: " + chantily.lePreco());

    ISobremesa caldadechocolate = new CaldaDeChocolate(chantily);
    System.out.println("Esse é o preço da base do sorvete + o preço da cobertura de Chaintily + o preço da calda de Chocolate: " + caldadechocolate.lePreco());

    ISobremesa ovomaltine = new Ovomaltine(caldadechocolate);
    System.out.println("Esse é o preço da base do sorvete + o preço da cobertura de Chaintily + o preço da calda de Chocolate + o preço do Ovomaltine: " + ovomaltine.lePreco());

    ISobremesa canudowaferbiju = new CanudoWaferBiju(ovomaltine);
    System.out.println("Esse é o preço da base do sorvete + o preço da cobertura de Chaintily + o preço da calda de Chocolate + o preço do Ovomaltine + o Canudo Wafer Biju: " + canudowaferbiju.lePreco());

  }
  
}
