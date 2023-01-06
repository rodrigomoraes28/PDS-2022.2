package Questao2;


public class ExemplodeUso {

  public static void main(String[] args) {
    

     BancoSingleton db1 = BancoSingleton.getInstance();

     ILanche pao = new Paofrances();
     db1.addLanche(pao);
     ILanche tomate = new Tomate(pao);
     db1.addLanche(tomate);

  }
  
}
