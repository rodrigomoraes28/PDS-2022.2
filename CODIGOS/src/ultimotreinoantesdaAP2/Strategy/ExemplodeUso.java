package Strategy;

public class ExemplodeUso {


  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
  }
  

  public void inicia(){


    IFrete frete1 = new PAC();

    Carrinho carrinho = new Carrinho(frete1);

    carrinho.addProduto(new Produto("Xbox", 0.5f));
    carrinho.addProduto(new Produto("PS4" , 0.4f));


    System.out.println(carrinho.lePrecoFrete());

    frete1 = new SEDEX();

    carrinho.setFrete(frete1);
    System.out.println(carrinho.lePrecoFrete());




  }
}
