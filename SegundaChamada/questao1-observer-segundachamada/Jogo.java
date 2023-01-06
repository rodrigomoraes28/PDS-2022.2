import java.util.ArrayList;

public class Jogo implements ISujeitoObservavel{


  ArrayList<IObservavel> observadores;
  boolean estadoSerpente;


  public Jogo(){
     this.observadores = new ArrayList<IObservavel>();
     this.estadoSerpente = true;

  }
  

  @Override
  public void removeObservador(IObservavel obs) {
    this.observadores.remove(obs);
    
  }

  @Override
  public void addObservador(IObservavel obs) {
    this.observadores.add(obs);
    
  }

  public void mudaEstado(Boolean novo_estado_serpente){
    this.estadoSerpente = novo_estado_serpente;
    notifica();

  }

  @Override
  public void notifica() {

    
    for (IObservavel iObservavel : observadores) {
      iObservavel.atualizaEstado(estadoSerpente);
    }
    
  }

  
  
}
