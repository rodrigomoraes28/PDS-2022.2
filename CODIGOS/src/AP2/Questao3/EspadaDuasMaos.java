package Questao3;

 
public class EspadaDuasMaos implements IEscolha , IEspada{


  @Override
   public int escolheEspada(IEspada espada) {
    return espada.leDano(100);
  }


  @Override
  public int leDano(int dano) {
    dano = 100;
    return dano;
  }
  
   
  
}
