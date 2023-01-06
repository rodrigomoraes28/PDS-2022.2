public class CaminhaoFiat implements IVeiculo{

  @Override
  public float preco() {
    return 100000f;
  }

  @Override
  public int ano() {
    return 2022;
  }

  @Override
  public String modelo() {
    String modelo = "Autobots";
    return modelo;
  }

  
  public String toString(){
    return ("Modelo do caminhao: " + modelo() + "\nAno: " + ano() + "\nPreço: " + preco());
 }

   
  
}
