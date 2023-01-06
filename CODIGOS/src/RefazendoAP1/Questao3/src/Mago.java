package Questao3.src;

public class Mago implements PersonagemGenerico{


  IArma arma;


  public Mago(IArma arma_ex){
    this.arma = arma_ex;
  }
 


  @Override
  public void usarArma(IArma arma_nova) {
    this.arma = arma_nova;
    System.out.println("Arma foi trocada para: " + arma_nova.getClass().getSimpleName());    
  }
  

  public String mostraArma(){
    return ("Arma atual do Mago: " + this.arma);
  }
}
