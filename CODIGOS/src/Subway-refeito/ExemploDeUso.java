import Base.Baguete30cm;
import Interfaces.ILanche;
import Recheios.Alface;
import Recheios.QueijoMussarela;
import Recheios.Tomate;

public class ExemploDeUso {
  

  public static void main(String[] args) {
    
    ExemploDeUso exemplo = new ExemploDeUso();
    exemplo.inicia();

  }
    

      public void inicia(){
 

       
        ILanche baguete30cm = new Baguete30cm(); //incializou com a base
        System.out.println(baguete30cm.lePreco());

        ILanche tomate = new Tomate(baguete30cm); 
        ILanche alface = new Alface(tomate);
        ILanche queijomussarela = new QueijoMussarela(alface);

        System.out.println("Preço Total: " + queijomussarela.lePreco());

      }
     


  }
 
