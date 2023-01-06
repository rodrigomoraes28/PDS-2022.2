public class MotoVW implements IVeiculo {

  @Override
  public float preco() {
     return 6000f;
  }

  @Override
  public int ano() {
    return 2009;
  }

  @Override
  public String modelo() {
    String modelo = "Yamaha";
    return modelo;
  }
  public String toString(){
    return ("Modelo da moto: " + modelo() + "\nAno: " + ano() + "\nPreço: " + preco());
 }
 
  
}
