package Strategy;

import java.util.ArrayList;

public class PAC implements IFrete{

  @Override
  public float lePreco(ArrayList<Produto> produto) {
    return 25f;
  }
  
}
