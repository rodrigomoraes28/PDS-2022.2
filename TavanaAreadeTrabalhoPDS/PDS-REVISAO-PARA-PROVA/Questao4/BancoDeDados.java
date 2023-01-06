package Questao4;

//na new poe o BancoDeDados.getInstance , nao da new nao

public class BancoDeDados {

  static BancoDeDados bd;

  private BancoDeDados(){

  }

  public static BancoDeDados getinstance(){
    return new BancoDeDados();
  }


  public void salvarUsuario(){
    //add usuario num arraylist de usuarios
  }
  
}
