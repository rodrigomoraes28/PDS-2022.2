import Base.SaborSorveteChocolate;
import Cobertura.CaldaDeCaramelo;
import Cobertura.CaldaDeChocolate;
import Cobertura.CaldaDeMorango;
import Interfaces.ISorvete;

public class ExemploDeUso {
  

  public static void main(String[] args) {
    
    ExemploDeUso exemplo = new ExemploDeUso();
    exemplo.inicia();

  }
    

      public void inicia(){
 

        //ISorvete -> ISorvete + ICobertura + //CoberturaGenerica ---> meio que essa implementa o ICobetura e as CaldaDeCaramelo e outras extendem do tipo ICobetura entao elas sao um tipo de ICobertura e os ICobertura extendem de ISorvete logo CaldaDeCaramelo e outras sao do tipo ISorvete tb (que era melhor ser chmado de ISobremesa)
        ISorvete sorveteChocolate = new SaborSorveteChocolate(); //incializou com a base
        System.out.println(sorveteChocolate.lePreco());

        ISorvete caldaDeChocolate = new CaldaDeChocolate(sorveteChocolate); //o CaldaDeChoclate tem no consturtor dele la o ISorvete entao se o sorveteChocolate que o nome um tipo de atributo que recebe como new ali o SaborSorveteChocolate que implemnta o ISorvete ele tb eh um tipo de ISorvete, entao cabe aq pra ir somando somando desde que o q seja passado no parametro seja uma classe que implement um ISorvete
        ISorvete caldaDeMorango = new CaldaDeMorango(caldaDeChocolate);
        ISorvete caldaDeCaramelo = new CaldaDeCaramelo(caldaDeMorango);

        System.out.println("Preço Total: " + caldaDeCaramelo.lePreco());

      }
     


  }
 
