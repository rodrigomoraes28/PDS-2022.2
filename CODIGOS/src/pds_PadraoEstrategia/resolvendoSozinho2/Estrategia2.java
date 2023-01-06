import java.util.ArrayList;

public class Estrategia2 implements IFrete3{

  @Override
  public float calcularFrete(ArrayList<Produto3> produtos) {


    float preco = 0;
    float pegarpeso = 0; 

    for (Produto3 produto3 : produtos) {
      pegarpeso += produto3.getPeso();
    }

    pegarpeso = preco * 7.5f;

    for (Produto3 produto3 : produtos) {
      preco += produto3.getPreco();
    }
    
    preco = preco + pegarpeso;
    return preco;
  }
  
}
