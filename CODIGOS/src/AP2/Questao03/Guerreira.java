package Questao03;

public class Guerreira {


  IEspada espada;
  IEscolha escolha;

  public Guerreira(IEspada espada_ex){
    this.espada = espada_ex;
  }
 
  // public float leDano(){
  //   return this.escolha.escolheEspada(espada);
  // }


  public void setEspada(IEspada espada) {
    this.espada = espada;
  }

  public int mostraDano(){
    return this.espada.atacar();
  }
  
  
}
