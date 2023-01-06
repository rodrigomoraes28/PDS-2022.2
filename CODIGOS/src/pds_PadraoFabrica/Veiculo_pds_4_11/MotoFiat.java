public class MotoFiat implements IVeiculo{

  @Override
  public float preco() {
    return 5000f;
  }

  @Override
  public int ano() {
    return 2008;
  }

  @Override
  public String modelo() {
    String modelo = "Harley Davyson";
    return modelo;
  }

  public String toString(){
    return ("Modelo da moto: " + modelo() + "\nAno: " + ano() + "\nPreço: " + preco());
 }
  
}
