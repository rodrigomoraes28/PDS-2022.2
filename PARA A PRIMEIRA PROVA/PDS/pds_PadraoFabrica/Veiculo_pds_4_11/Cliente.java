public class Cliente {
  
  IVeiculoFactory iveiculofactory;

  public Cliente(){
    iveiculofactory = new VeiculoFiatFactory();
  }

  public IVeiculo criarVeiculo(String tipo){
    IVeiculo iveiculo = iveiculofactory.criarVeiculo(tipo); 
    return iveiculo;
  }

  // public void mostrarVeiculo(String tipo){

  //   return()
  // }
















//   public Pizza criaPizza(String tipo){
//     Pizza pizza = factory.criarPizza(tipo);
    
//     return pizza;
// }




  // PizzaFactory factory;

  // public Cliente(){
  //     factory = new PizzaPaulyneFactory();
  // }

}
