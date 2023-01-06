
public class TestaEstrategia {

  public static void main(String[] args) {
    
      TestaEstrategia exemplo = new TestaEstrategia();
      exemplo.inicia();

  }

  public void inicia(){


    IFrete2 frete = new StrategyA(); //o frete recebe como parametro uma das classes que implementam a interface IFrete2 
    Carrinho2 carrinho2 = new Carrinho2(frete); // dae no carrinho vc tem que inicializar o construtor dele, mas ja ta como arraylist dae so precisa o parametro do tipo IFrete2 que ae eh a variavel q vc chamou de frete

    //e cria o produto ae mesmo no adicionar produto pra nao ter q criar cada um chamando sua variavel tipo
    //ae fiz como é criando um objeto do tipo Produto pra vc ver mas n tem essa necessidade
    Produto produto1 = new Produto("S8",0.2f);
		carrinho2.adicionarProduto(produto1); //adiciona os itens na estrategia


    carrinho2.adicionarProduto(new Produto("Xbox-one",1.5f)); //adiciona os itens na estrategia
		carrinho2.adicionarProduto(new Produto("Jogo da Vida",0.5f)); //adiciona os itens na estrategia
		carrinho2.adicionarProduto(new Produto("Os Sertões",0.8f)); //adiciona os itens na estrategia
		carrinho2.adicionarProduto(new Produto("Taco de Golf",2f)); //adiciona os itens na estrategia


    float precoFrete = carrinho2.calcularFrete(); //atribui a uma variavel criada o metodo calcularfrete do objeto Carrinho2 e seu nome como variavel desse tipo eh carrinho2 (com C minusculo), mas n precisava, mas eh 1 boa por pq organiza melhor o codigo
    System.out.println("Frete fixo:" + precoFrete);

    //
    frete = new StrategyB(); //nao precisa criar um novo frete pq seria desncessario, ae so reatribui ao ja criado outra estrategia
    carrinho2.setFrete(frete);  //setando mudando o frete
    precoFrete = carrinho2.calcularFrete(); //igual no outro, agr ja tendo o frete mudado se calcula dnv
    System.out.println("Frete por peso:" + precoFrete) ;

    frete = new StrategyC(); // a variavel frete que eh do tipo IFrete2 (uma interface) no qual tem 3 classes que implementam seus metodos, ou seja uma herança indireta, recebe o objeto da StrategyC
    carrinho2.setFrete(frete); //a variavel carrinho2 que é a que criei para o objeto Carrinho2 tem seu metodo (que tem dentro da classe dela) chamado setFrete incializado e passo como parametro o frete (atributo criado ali em cima no IFrete2 frete)
    precoFrete = carrinho2.calcularFrete(); //criei essa variavel la em cima e pra n criar 1 nova toda hora eu so mudo o parametro q ela recebe, ae no caso ela vai receber o retorno da variavel carrinho2 que ta puxando o metodo calcularFrete que calcula o frete e retorna um float, so por isso posso usar ela, ela eh do tipo float q nem a variavel precoFrete q criei

  }
  
}
 
