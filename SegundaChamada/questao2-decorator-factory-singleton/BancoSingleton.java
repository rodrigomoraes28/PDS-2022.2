import java.util.ArrayList;

public class BancoSingleton {


  ArrayList<ISorvete> sorvete = new ArrayList<ISorvete>();


  public void addSorvete(ISorvete sorvete_novo){
    this.sorvete.add(sorvete_novo);
  }

  public String getArrayListSorvete(){
    return ("Preço final do sorvete foi de : " + ((ISorvete) sorvete).lePreco());
  }
 

  private static BancoSingleton uniqueIstance;


  private BancoSingleton(){}

  public static BancoSingleton getIntance(){
    if(uniqueIstance == null){
      return new BancoSingleton();
    }
    else{
      return uniqueIstance;
    }
  }
  
}
