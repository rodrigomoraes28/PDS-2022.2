package Questao1;

public class Dragao implements IObservador {

 

  @Override
  public void atualizaEstado(boolean estado) {
    if(estado == true){
      System.out.println("Atacar Jogador");
    }
    else{
      System.out.println("Dormindo");
    }
    
  }

  

  
  
}
