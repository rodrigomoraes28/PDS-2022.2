import java.util.ArrayList;

public class Carrinho {


  ArrayList<Produto> produtos;
  IStrategy estrategia;
 
  
	//aqui tambem tem que lembrar que alem de inicializar o arraylist tem q por o IStrategy no construtor e incializar ele assim como foi feito
	public Carrinho(IStrategy estrategia) {
		produtos = new ArrayList<Produto>();
		this.estrategia = estrategia;
	}
	
  //aq ja tem q estudar mais um pouco mas nao eh nada complicado
	public void adicionaProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
  //aqui tambem de boa, facinho
	public void setFrete(IStrategy estrategia) {
		this.estrategia = estrategia;
	}
	
  //aqui é facil, d boa, pra saber 
	public float calculaFrete() { 
      return this.estrategia.calculaFrete(produtos);
  }


 

  
  
}
