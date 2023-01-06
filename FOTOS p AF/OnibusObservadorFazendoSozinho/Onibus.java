import java.util.ArrayList;

public class Onibus implements ISujeitoObservavel {


  ArrayList<IObservador> observadores;
  EstadosOnibus estadoAtual;


  public Onibus(){
    this.estadoAtual = EstadosOnibus.CHEGOU_NA_PRACA;
    this.observadores = new ArrayList<IObservador>();
  }

  @Override
  public void addObservador(IObservador obs) {
    this.observadores.add(obs);
    
  }

  @Override
  public void removeObservador(IObservador obs) {
    this.observadores.remove(obs);    
  }

  @Override
  public void notifica() {
   for (IObservador iObservador : observadores) {
    iObservador.atualizaEstado(this.estadoAtual);
   }
    
  }

  public void mudaEstado(EstadosOnibus estadosOnibus){
    this.estadoAtual = estadosOnibus;
    notifica();
  }
  
}
