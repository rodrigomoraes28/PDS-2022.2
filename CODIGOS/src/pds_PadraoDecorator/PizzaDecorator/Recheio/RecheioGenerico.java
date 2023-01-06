package PizzaDecorator.Recheio;

// import Interfaces.ICobertura;
import PizzaDecorator.Interfaces.IMassaPizza;
import PizzaDecorator.Interfaces.IRecheio;

public abstract class RecheioGenerico implements IRecheio{

  IMassaPizza massa;
  float preco;

  public RecheioGenerico(IMassaPizza massa_ex){
    this.massa = massa_ex;

  }


  public float lePreco(){
    return this.preco + massa.lePreco();
  }
  
}
