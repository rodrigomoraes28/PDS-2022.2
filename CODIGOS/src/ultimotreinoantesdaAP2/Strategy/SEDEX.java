package Strategy;

import java.util.ArrayList;

public class SEDEX implements IFrete{

  @Override
  public float lePreco(ArrayList<Produto> produto) {

    float valor = 0;

    for (Produto produto2 : produto) {
        valor += produto2.getPeso() * 5f;
    }
    
    return valor;
  }
  
}
