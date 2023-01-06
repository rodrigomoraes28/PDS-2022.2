public class FabricaFiat implements IFabrica{

  @Override
  public IVeiculo criarVeiculo(String tipo) {

    switch(tipo){
      case "caminhao": 
        return new CaminhaoFiat();
      case "carro":
        return new CarroFiat();
      case "moto":
        return new MotoFiat();
      default: return new CarroFiat();        
    }
          
  }
  
}
