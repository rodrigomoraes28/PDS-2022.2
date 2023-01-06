public class TestaEstrategia {

  public static void main(String[] args) { //tem que por a main aqui dentro senao nao vai

    TestaEstrategia exemplo = new TestaEstrategia();
    exemplo.iniciar();
    
  } 
  public void iniciar(){

    // System.out.println("teste");

    IStrategy estrategia = new StrategyA(); //oia aq esse atributo mesmo q eu vo por no construtor do carrinho
    Carrinho carrinho = new Carrinho(estrategia); //aqui passa ja a estrategia que vai usar
    System.out.println(carrinho.calculaFrete()); // ainda nao tem nada entao eh so o preço mesmo do frete sem o preço dos produtos

    carrinho.adicionaProduto(new Produto("Xbox-One", 2500f, 2));
    carrinho.adicionaProduto(new Produto("PS4", 4000f, 1.5F));
    carrinho.adicionaProduto(new Produto("Os Sertões", 150f, 1.5f));
    carrinho.adicionaProduto(new Produto("Jogo da Vida", 50f, 0.3f));


    System.out.println(carrinho.calculaFrete()); //frete fixo

    estrategia = new StrategyB(); //botei outro frete pra o IStrategy pegar
    carrinho.setFrete(estrategia); //botei esse outro tipo de frete no carrinho na funcao setFrete

    System.out.println(carrinho.calculaFrete()); //quantidade de item, correto

    estrategia = new StrategyC(); //botei outro frete pra o IStrategy pegar
    carrinho.setFrete(estrategia); //botei esse outro tipo de frete no carrinho na funcao setFrete
    System.out.println(carrinho.calculaFrete()); // pelo peso, soma os pesos e dps multplica por 2

  }
  
}
