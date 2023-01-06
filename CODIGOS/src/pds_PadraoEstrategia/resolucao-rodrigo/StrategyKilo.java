import java.util.ArrayList;
 
public class StrategyKilo implements IFrete{

 
  @Override
  public float calcularFrete(ArrayList<Product> produtos) {
    
      float peso = 0; //inicializacao da variavel, para funcionar o += ou atribuir dps qlqr valor a variavel ela precisa ser incializada, por isso o = 0, inicializar zerado
      for(Product product : produtos){ //product é a variavel que acabei de criar, ela percorre todo o ArrayList de produtos
        peso += product.getPeso(); //peso recebe o peso de todos os product , a nova variavel criada aqui 
      }
    return peso * 10f;
  }

   
}
