import java.util.ArrayList;

public class Sedex implements IFrete {

  @Override
  public float calculaFrete(ArrayList<Produto> produto) {

    int preco = 0;
    for (Produto produto2 : produto) {
      preco += (produto2.getPeso() * 5f);
    }

    return preco;
     
  }
  
}
