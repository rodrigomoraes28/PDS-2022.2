package Questao1;

import java.util.ArrayList;

public class Jogo implements ISujeitoObservavel{

  ArrayList<IObservador> observador;
  boolean estado;


  public Jogo(){
    this.observador = new ArrayList<IObservador>();
    this.estado = false;
  }

  @Override
  public void addObservador(IObservador obs) {
    this.observador.add(obs);
    
  }

  @Override
  public void removeObservador(IObservador obs) {
    this.observador.remove(obs);
     
  }

  @Override
  public void notifica() {
    for (IObservador iObservador : observador) {
      iObservador.atualizaEstado(estado);
    }
    
  }

  public void setEstado(boolean estado_novo){
      this.estado = estado_novo;
      notifica();
  }



  
}
