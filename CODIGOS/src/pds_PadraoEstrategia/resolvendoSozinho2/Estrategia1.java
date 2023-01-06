import java.util.ArrayList;

public class Estrategia1 implements IFrete3{

  @Override
  public float calcularFrete(ArrayList<Produto3> produtos) {

      float preco = 0;
 
      for (Produto3 produto3 : produtos) {
        preco += produto3.getPreco();
      }
      preco += 25;
    // TODO Auto-generated method stub
    return preco;
  }
  
}

 