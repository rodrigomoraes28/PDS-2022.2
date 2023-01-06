import java.util.ArrayList;

public class Estrategia3 implements IFrete3 {

  @Override
  public float calcularFrete(ArrayList<Produto3> produtos) {

    float preco = 0;

    for (Produto3 produto3 : produtos) {
        preco += produto3.getPreco();
    }

    preco = preco + produtos.size();

    
     return preco;
  }
  
}
