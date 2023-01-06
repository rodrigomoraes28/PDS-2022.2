public class Espada implements IArma {

  // essa que usa implements e implementa todos os metodos e atributos se chama herança direta
  public int ataque(){
    return 10;
  }

  public int colldown(){
    return 2;
  }  
  
  public String toString(){
    return "Dano da Espada: " + this.ataque() + " Recuo da espada: " + this.colldown();
  }

  @Override
  public String getNome() {
    return "Espada";
  }
}
