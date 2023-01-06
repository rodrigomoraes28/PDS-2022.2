public class ExemplodeUso {


  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
  }


  public void inicia(){

    IFrete frete = new PAC();

    Carrinho carrinho = new Carrinho(frete);

    carrinho.addProduto(new Produto("Xbox", 2.5f));
    carrinho.addProduto(new Produto("PS4", 1.5f));

    System.out.println(carrinho.calculaFrete());
 
    frete = new Sedex();
    carrinho.setFrete(frete);
    System.out.println(carrinho.calculaFrete());


  }
  
}
