package Base;
import Interfaces.ISorvete;

public class SaborSorveteChocolate implements ISorvete { //a classe SaborSorveteChocolate é a base, e implementa a interface ISorvete (e ISorvete é ISorvete + ICobertura)

  public float lePreco(){
    return 10.0f;
  }

  
}
