package vendocomofaz;


import vendocomofaz.Base.SorveteBaunilha;
import vendocomofaz.Cobertura.CaldaDeCatupiry;
import vendocomofaz.Cobertura.CaldaDeChocolate;
import vendocomofaz.Cobertura.CaldaDeMorango;
import vendocomofaz.Interfaces.ISobremesa;

public class ExemploDeUso {
  public static void main(String[] args) {
    


  ExemploDeUso exemplo = new ExemploDeUso();

  exemplo.inicia();
  }

  public void inicia(){


    ISobremesa sorvetebaunilha = new SorveteBaunilha();
    System.out.println(sorvetebaunilha.lePreco());

    ISobremesa caldamorango = new CaldaDeMorango(sorvetebaunilha);
    System.out.println(caldamorango.lePreco());

    ISobremesa caldadecatupiry = new CaldaDeCatupiry(caldamorango);
    System.out.println(caldadecatupiry.lePreco());

    ISobremesa caldadechocolate = new CaldaDeChocolate(caldadecatupiry);
    System.out.println(caldadechocolate.lePreco());



  
}

}
