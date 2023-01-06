public class VeiculoVWFactory implements IVeiculoFactory{

  @Override
  public IVeiculo criarVeiculo(String tipo) {

    switch(tipo){
      case "caminhao1":
        return new CaminhaoVW();
      case "carro1":
        return new CarroVW_1();
      case "carro2":
        return new CarroVW_2();
      case "carro3":
        return new CarroVW_3();
      case "moto":
        return new MotoVW();
      default:
        return null;
    }
     
  }
  
}
