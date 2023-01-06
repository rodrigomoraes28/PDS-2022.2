package TiposAcionadores;
import Acionador.Acionador;
import IEletrodomesticos.IEletrodomestico; 



public class Botao {


  private IEletrodomestico eletrodomestico;
  public void ligar(){
    eletrodomestico.ligar();
  }

  public void desligar(){
    eletrodomestico.desligar();
  }

  public Botao(IEletrodomestico eletrodomesticor){
    this.eletrodomestico = eletrodomesticor;
  }

  public void setEletrodomestico(IEletrodomestico eletrodomesticor){
    this.eletrodomestico = eletrodomesticor;
  }
}
