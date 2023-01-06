package Observer2;

import java.util.ArrayList;

public class Onibus implements ISujeitoObservavel{

  
  ArrayList<IObserver> observadores;
  EstadosOnibus estadoAtual;

  public Onibus(){
    this.estadoAtual = EstadosOnibus.CHEGOU_NA_UFC; //aq tambem
    this.observadores = new ArrayList<IObserver>();
   }


  @Override
  public void addObservador(IObserver obs) {
    this.observadores.add(obs);
    
  }

  @Override
  public void removeObservador(IObserver obs) {
    this.observadores.remove(obs);  
  }

  @Override 
  //lascou n entendi
  public void notifica() {

    for (IObserver iObserver : observadores) {
      iObserver.atualizaEstado(estadoAtual); //se atente aqui
    }
    
  }

  public void setEstadoAtual(EstadosOnibus estadoAtual) {
    this.estadoAtual = estadoAtual;
    notifica();
  }
  
}
