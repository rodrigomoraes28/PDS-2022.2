package Questao2;

public class ExemploDeUso {

  public static void main(String[] args) {
    ExemploDeUso exemplo = new ExemploDeUso();
    exemplo.inicia();
  }


  void inicia(){

    ITransportadora iTransportadora = new Sedex();
    Carrinho carrinho = new Carrinho(iTransportadora);

    carrinho.adicionaItemAoCarrinho(new Produto(0.2f, "S8"));
    carrinho.adicionaItemAoCarrinho(new Produto(0.5f, "Livro"));
    carrinho.adicionaItemAoCarrinho(new Produto(1.5f, "TV"));

   float precoFrete = carrinho.lePrecoFrete();
   System.out.println("Frete SEDEX: "+ precoFrete);
		
   iTransportadora = new PAC();
   carrinho.setTransportadora(iTransportadora);
   precoFrete = carrinho.lePrecoFrete();
   System.out.println("Frete PAC: "+ precoFrete);
		
	 

     

  }
  
}
