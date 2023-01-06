import java.util.ArrayList;

public class StrategyB implements IFrete2{

  @Override
  public float calcularFrete(ArrayList<Produto> produtos) {
    float peso = 0;

    for(Produto product : produtos){ //Produto em roxo é o tipo objeto produto, ae o product tu q criou ae no for, 1 variavel do tipo objeto Produto, e o produtos é a que ta ali nos parametros que tem q ficar dps do :
        peso += product.getPeso(); 
    }
     return peso;
  }

 
  
}
