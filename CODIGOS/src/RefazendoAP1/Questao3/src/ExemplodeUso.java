package Questao3.src;

public class ExemplodeUso {


  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
  }

  public void inicia(){

    IArma arma = new Anel();
    Mago mago = new Mago(arma);

    System.out.println(mago.mostraArma());

    arma = new Cajado();
    mago.usarArma(arma);
    
    System.out.println(mago.mostraArma());



  }
  
}
