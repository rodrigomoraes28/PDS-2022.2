import java.util.ArrayList;

public class FretePAC implements IFrete{

  @Override
  public float calculaFrete(ArrayList<Produto> produto) {

    float valor = 0;
    valor += produto.size() * 7.5f;
    return valor;
    
  }
  
}
