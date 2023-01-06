package PizzaDecorator;

import PizzaDecorator.Base.PizzaMussarela;
import PizzaDecorator.Interfaces.IMassaPizza;
import PizzaDecorator.Recheio.BordaCatupiri;
import PizzaDecorator.Recheio.QueijoExtra;

public class ExemplodeUso{

  public static void main(String[] args) {


    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
    
  }

  public void inicia(){
 

     IMassaPizza pizzamussarela = new PizzaMussarela();
     System.out.println(pizzamussarela.lePreco());
     IMassaPizza queijoextra = new QueijoExtra(pizzamussarela);
     System.out.println(queijoextra.lePreco());
     IMassaPizza bordacatupri = new BordaCatupiri(queijoextra);
     System.out.println(bordacatupri.lePreco());

      

  }

}