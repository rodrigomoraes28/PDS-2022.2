public class ExemplodeUso {


  public static void main(String[] args) {
    

    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
  }

  public void inicia(){

    BancoSingleton db1 = BancoSingleton.getIntance();    
    ISorvete sorvete_soma;

    IFabrica fabrica = new FabricaSorvete();

    sorvete_soma = fabrica.criaISorvete("Leite");
    
    ISorvete chocolate = new Chocolate(sorvete_soma);
    ISorvete maracuja = new Maracuja(chocolate);
    ISorvete morango = new Morango(maracuja);
    ISorvete limao = new Limao(morango);

    db1.addSorvete(limao);

    System.out.println(db1.getArrayListSorvete());
    

  }
  
}
