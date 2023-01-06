package Questao3;


public class Guerreira{


  IEspada espadas; //tipo o arraylist de produto
  IEscolha escolha_atual; //tipo o IFrete
  
  public Guerreira(){
    espadas = new EspadaDuasMaos();    
  }
 

  public void setEscolha(IEscolha escolha) {
    this.escolha_atual = escolha;
  }


 


}