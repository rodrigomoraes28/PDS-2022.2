import java.util.ArrayList;

public class FretePeso implements IFrete {

  @Override
  public float calculaFrete(ArrayList<Produto> produto) {


    float valor = 0;
   for (Produto produto2 : produto) {
      valor += (produto2.getPeso() * 5f);
   }
    return valor;
  }
  
}
