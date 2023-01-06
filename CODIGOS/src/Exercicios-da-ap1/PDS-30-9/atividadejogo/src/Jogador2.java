public class Jogador2 {

  private Vida vida;
  private IArma arma;

  Jogador2(int vida_jogador2, IArma arma_jogador2){
    this.vida = new Vida(vida_jogador2);
    this.arma = arma_jogador2;
  }

  public int usarArma(){
    return arma.ataque();
  }

  public void trocaArma(IArma arma_nova){
    this.arma = arma_nova;
  }

  public int getVida(){
    return this.vida.getVida();
  }
  
  public IArma getArma(){
    return this.arma;
  }

}
