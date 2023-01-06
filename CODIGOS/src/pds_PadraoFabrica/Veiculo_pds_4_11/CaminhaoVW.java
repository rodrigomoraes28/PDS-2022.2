public class CaminhaoVW implements IVeiculo{

  @Override
  public float preco() {
    return 30000f;
  }

  @Override
  public int ano() {
    return 2007;
  }

  @Override
  public String modelo() {
    String modelo = "Optimus Prime";
    return modelo;
  } 

  public String toString(){
    return ("Modelo do caminhao: " + modelo() + "\nAno: " + ano() + "\nPreço: " + preco());
 }

}