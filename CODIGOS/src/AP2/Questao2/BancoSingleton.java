package Questao2;

import java.util.ArrayList;

public class BancoSingleton {

  
  ArrayList<ILanche> lanche = new ArrayList<ILanche>();

  public void addLanche(ILanche lanche_novo){
    this.lanche.add(lanche_novo);
  }


  private static BancoSingleton uniqueInstance;

  private BancoSingleton(){}

  public static BancoSingleton getInstance(){
    if(uniqueInstance == null){
      return new BancoSingleton();
    }
    else{
      return uniqueInstance;
    }
  }
  
}
