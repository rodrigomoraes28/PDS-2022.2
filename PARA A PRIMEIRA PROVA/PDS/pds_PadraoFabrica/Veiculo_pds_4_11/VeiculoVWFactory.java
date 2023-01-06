public class VeiculoVWFactory implements IVeiculoFactory{

  @Override
  public IVeiculo criarVeiculo(String tipo) {

    switch(tipo){
      case "caminhao":
        return new CaminhaoVW();
      case "carro":
        return new CarroVW();
      case "moto":
        return new MotoVW();
      default:
        return null;
    }
     
  }
  
}
