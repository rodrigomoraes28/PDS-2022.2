package Decorator;

public class ExemplodeUso {


  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
  }


  public void inicia(){
    

    ISobremesa sorvetebaunilha = new SorveteBaunilha();
    ISobremesa coberturacaramelo = new CoberturaCaramelo(sorvetebaunilha);
    ISobremesa coberturabaunilha = new CobeturaBaunilha(coberturacaramelo);

    System.out.println("Total: " + coberturabaunilha.lePreco());

  }
  
}
