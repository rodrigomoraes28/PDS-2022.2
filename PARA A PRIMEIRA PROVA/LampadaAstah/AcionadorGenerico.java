public abstract class AcionadorGenerico implements IAcionador{

  public void ligar(){

    System.out.println("Ligar eletrodomestico " + getClass().getSimpleName());
  }
  
  public void desligar(){

    System.out.println("Desligar eletrodomestico " + getClass().getSimpleName());
  }
}
