package vendocomofaz.Base;

import vendocomofaz.Interfaces.ISobremesa;

public class SorveteBaunilha implements ISobremesa {

  @Override
  public float lePreco() {
     return 15.0f;
  }

  //aqui é a base, ela nao pode ter mais de uma ou ser mudada, ou é so SorveteChocolate ou outro tipo, mas nao pode juntar
  //2 deles num som
  //ou tb poderia ter outro pra Açai por exemplo, é um exemplo, mas as bases nunca se juntam, sempre sao coisas separads
  
}
