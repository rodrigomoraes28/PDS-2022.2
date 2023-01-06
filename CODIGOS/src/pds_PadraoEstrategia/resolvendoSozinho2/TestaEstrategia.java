public class TestaEstrategia {

  public static void main(String[] args) {

    TestaEstrategia exemplo = new TestaEstrategia();
    exemplo.inicia();
    

  }

  public void inicia(){

    IFrete3 frete = new Estrategia1();
    Carrinho3 carrinho3 = new Carrinho3(frete);


    carrinho3.adicionarProduto(new Produto3("Xbox-One", 2500f, 2.5f));
    carrinho3.adicionarProduto(new Produto3("PS4", 4000f, 1.5f));
    carrinho3.adicionarProduto(new Produto3("Os Sertões", 80f, 0.5f));
    carrinho3.adicionarProduto(new Produto3("Jogo da Vida", 50f, 0.5f));

    float fretePreco = carrinho3.calcularFrete();

    System.out.println("Preço total da compra + Frete da estrategia 1 (frete fixo) é : " + fretePreco);


    //mudar o frete
    frete = new Estrategia2();
    carrinho3.setFrete(frete);
    fretePreco = carrinho3.calcularFrete();
    System.out.println("Preço total da compra + Frete da estrategia 2 (frete por peso) é : " + fretePreco);
   // System.out.println("Frete da estrategia 1 é:" + frete.calcularFrete(null));


    //mudar o frete mais uma vez
    frete = new Estrategia3();
    carrinho3.setFrete(frete);
    fretePreco = carrinho3.calcularFrete();
    System.out.println("Preço total da compra + Frete da estrategia 3 (frete por unidade) é : " + fretePreco);
    

  }



  
}
