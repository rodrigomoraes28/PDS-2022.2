import java.util.ArrayList;

public class StrategyFixo implements IFrete{
 
  @Override
  public float calcularFrete(ArrayList<Product> products) {
    return 25f;
  }
  
}
