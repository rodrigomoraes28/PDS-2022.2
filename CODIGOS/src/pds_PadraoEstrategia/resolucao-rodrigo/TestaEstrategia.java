public class TestaEstrategia {

	public static void main(String[] args) {
		TestaEstrategia exemplo = new TestaEstrategia();
		exemplo.inicia();
	}
	
	public void inicia() {
		IFrete frete = new StrategyFixo(); //interface atributo = new estretagiaA
		Carrinho carrinho = new Carrinho(frete);	//incializa o carrinho (que eh onde vc escolhe uma das estrategias) e poe nele o atributo que recebe a estrategia criada
		carrinho.adicionarProduto(new Product("S8",0.2f)); //adiciona os itens na estrategia
		carrinho.adicionarProduto(new Product("cafundo",2.0f));
		carrinho.adicionarProduto(new Product("pequeno principe",0.3f));
		carrinho.adicionarProduto(new Product("vidas secas",0.3f));
		carrinho.adicionarProduto(new Product("TDD na prática",0.3f));
		
		//calcular o frete
		float precoFrete = carrinho.calcularFrete(); //criou 1 novo variavel do tipo float q recebe o metodo calcular frete do carrinho (onde vc escolhe uma das estrategias) que foi criado e inicializado la em cima
		System.out.println("Frete fixo: " + precoFrete);
		
		//trocar o frete
		frete = new StrategyUnidade();  //incializou a estrategia de unidade, criou o objeto
		carrinho.setFrete(frete);				//trocou ele aqui para esse novo
		precoFrete = carrinho.calcularFrete(); //ae fez a parada pra calcular o frete
		System.out.println("Frete por unidade: " + precoFrete);
		
		//trocar o frete
		frete = new StrategyKilo();
		carrinho.setFrete(frete);
		precoFrete = carrinho.calcularFrete();
		System.out.println("Frete por peso: " + precoFrete);
		
		
	}

}