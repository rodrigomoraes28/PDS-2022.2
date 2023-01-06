public class Jogador1 {

  private Vida vida;
  private IArma arma;

  Jogador1(int vida_jogador1, IArma arma_jogador1){
    this.vida = new Vida(vida_jogador1);
    this.arma = arma_jogador1;
  }

  public int usarArma(){
    int dano = this.arma.ataque();
    System.out.println("Jogador 1 deu dano de: " + dano);
    return dano;
    // return arma.ataque();
  }

  public void trocaArma(IArma arma_nova){
    this.arma = arma_nova;
    System.out.println("Jogador 1 trocou para a arma: " + this.arma.getNome());
  }

  public int getVida(){
    return this.vida.getVida();
  }
  
  public IArma getArma(){
    return this.arma;
  }

}
