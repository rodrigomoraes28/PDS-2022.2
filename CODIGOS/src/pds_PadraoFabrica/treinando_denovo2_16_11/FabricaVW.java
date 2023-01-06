public class FabricaVW implements IFabrica{

  @Override
  public IVeiculo criarVeiculo(String tipo) {

    switch(tipo){
      case "caminhao": 
        return new CaminhaoVW();
      case "carro":
        return new CarroVW();
      case "moto":
        return new MotoVW();
      default: return new CarroVW();        
    }
          
  }
  
}
