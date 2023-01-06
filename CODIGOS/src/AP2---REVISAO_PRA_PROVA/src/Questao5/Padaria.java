import java.util.ArrayList;

public class Padaria implements ISujeitoObservavel{

  boolean EstadoAtual;
  ArrayList<IObservador> observadores;


  public Padaria(){
    this.observadores = new ArrayList<IObservador>();
    this.EstadoAtual = false;
  }

  @Override
  public void removeObservador(IObservador observador) {
    this.observadores.remove(observador);    
  }

  @Override
  public void adicionaObservador(IObservador observador) {
    this.observadores.add(observador);    
  }

  @Override
  public void notifica() {
    for (IObservador iObservador : observadores) {
        iObservador.atualiza(this.EstadoAtual);
    }
    
  }

  public void setEstado(boolean estadoNovo){
      this.EstadoAtual = estadoNovo;
      notifica();
  }

  
  
}
