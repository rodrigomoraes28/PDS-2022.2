package PizzaDecorator.Recheio;

import PizzaDecorator.Interfaces.IMassaPizza;

public class BordaCatupiri extends RecheioGenerico{

  public BordaCatupiri(IMassaPizza massa_ex) {
    super(massa_ex);
    this.preco = 5.0f;
  }
  
  
}
