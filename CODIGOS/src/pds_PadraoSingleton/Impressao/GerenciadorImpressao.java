package Impressao;

public class GerenciadorImpressao {

  private static GerenciadorImpressao uniqueInstance;

  private GerenciadorImpressao(){}


  public static GerenciadorImpressao getInstance(){
    if(uniqueInstance == null){
      uniqueInstance = new GerenciadorImpressao();
    }
    return uniqueInstance;
  }
  
}
