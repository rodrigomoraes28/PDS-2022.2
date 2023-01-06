public class CarroVW_1 implements IVeiculo{

  @Override
  public float preco() {
    return 50000f;
  }

  @Override
  public int ano() {
       return 2011;
  }

  @Override
  public String modelo() {
    String nome = "Duster";
    return nome;
  }

  public String toString(){
     return ("Modelo do carro: " + modelo() + "\nAno: " + ano() + "\nPreço: " + preco());
  }
  
  
}
