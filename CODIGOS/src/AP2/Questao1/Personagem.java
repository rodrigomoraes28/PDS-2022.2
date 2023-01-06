package Questao1;

public class Personagem implements IObservador {


   

  @Override
  public void atualizaEstado(boolean estado) {

    if(estado == true){
      System.out.println("Foge, dragão ta acordado");
    }

    else{
      System.out.println("Drago dormindo, pode pegar os ovos");
    }
   
    
    
  }

 
  
}
