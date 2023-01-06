package PizzaDecorator.Recheio;

import PizzaDecorator.Interfaces.IMassaPizza;

public class QueijoExtra extends RecheioGenerico{

  public QueijoExtra(IMassaPizza massa_ex) {
    super(massa_ex);
    this.preco = 6.0f;
  }
  
}
