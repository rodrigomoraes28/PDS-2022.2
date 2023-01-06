package Questao4;

public class App {
  public static void main(String[] args) {
    

    App app = new App();

    app.inicia();
  }


  public void inicia(){

    
    Usuario usuario = new Usuario("Rodrigo", 19);
    

    BancoDeDados.getinstance();
  }
  
}
