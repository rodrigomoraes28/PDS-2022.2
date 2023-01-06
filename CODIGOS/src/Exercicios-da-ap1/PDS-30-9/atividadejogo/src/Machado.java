public class Machado implements IArma{

  public int ataque() {
    return 7;
  }
 
  public int colldown() {
    return 4;
  }

  
  
  public String toString(){
    return "Dano do machado: " + this.ataque() + " Recuo do machado: " + this.colldown();
  }

  @Override
  public String getNome() {
    return "Machado";
  }
}
