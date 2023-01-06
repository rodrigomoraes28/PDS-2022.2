package Subiway;

import Subiway.Base.Baguete;
import Subiway.Interfaces.ILanche;
import Subiway.Recheios.Alface;
import Subiway.Recheios.QueijoMussarela;
import Subiway.Recheios.Tomate;

public class ExemplodeUso {

  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
  }

  public void inicia(){

    ILanche baguete = new Baguete();
    System.out.println(baguete.lePreco());

    ILanche queijomussarela = new QueijoMussarela(baguete);
    System.out.println(queijomussarela.lePreco());

    ILanche tomate = new Tomate(queijomussarela);
    System.out.println(tomate.lePreco());

    ILanche alface = new Alface(tomate);

    System.out.println(alface.lePreco());
  }
  
}
