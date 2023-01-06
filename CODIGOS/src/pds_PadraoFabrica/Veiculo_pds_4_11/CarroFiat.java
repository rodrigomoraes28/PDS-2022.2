public class CarroFiat implements IVeiculo{

  @Override
  public float preco() {
    return 40000f;
  }

  @Override
  public int ano() {
    return 2018;
  }

  @Override
  public String modelo() {
    String modelo = "Fiat Uno Mille";
    return modelo;
  }
  
  public String toString(){
    return ("Modelo do carro: " + modelo() + "\nAno: " + ano() + "\nPreço: " + preco());
  }
}
