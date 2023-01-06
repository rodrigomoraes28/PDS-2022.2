public class ExemplodeUso {

  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
  }

  public void inicia(){

    ISobremesa acai = new Acai();

    ISobremesa chocolatecalda = new ChocolateCalda(acai);
    ISobremesa leiteempo = new LeiteemPo(chocolatecalda);
    
    System.out.println("Preço total da sobremesa: " + leiteempo.lePreco());


  }
  
}
