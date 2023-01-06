package Questao2;

import java.util.ArrayList;

public class PAC implements ITransportadora {

  @Override
  public float calcularFrete(ArrayList<Produto> Produto) {

    float valor = 0;
    for (Produto produto2 : Produto) {
      valor += produto2.getPeso();      
    }
    
    return valor;
  }
  
}
