// import VeiculoFiatFactory;

public class App{
  public static void main(String[] args) {

    Cliente cliente = new Cliente();
    VeiculoVWFactory veiculovwfactory = new VeiculoVWFactory();

    System.out.println(veiculovwfactory.criarVeiculo("carro3"));
    //cliente.toStringteste("carro3");
    //cliente.criarVeiculo("carro3");
    
    
  }
}