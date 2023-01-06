public class ExemplodeUso {


  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();

    exemplodeUso.inicia();
  }


  public void inicia(){

    BancoSingleton db1 = BancoSingleton.getInstance();

    IFabrica fabrica = new FabricaLanche();
    ILanche soma_lanche;


    soma_lanche = fabrica.criaLanche("Baguete");
    ILanche tomate = new Tomate(soma_lanche);
    ILanche queijo = new Queijo(tomate);
    ILanche carne = new Carne(queijo);
    ILanche alface = new Alface(carne);



    db1.addLanche(alface);
    System.out.println(db1.mostraPreco());

  }
  
}
