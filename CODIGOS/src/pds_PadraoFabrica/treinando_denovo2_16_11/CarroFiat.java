public class CarroFiat implements IVeiculo{

  @Override
  public float lePreco() {
    // TODO Auto-generated method stub
    return 10000f;
  }

  public String toString(){
    return "Preço do Carro: " + (lePreco());
  }
  
}