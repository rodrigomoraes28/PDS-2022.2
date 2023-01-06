import java.util.ArrayList;

public class Onibus implements ISujeitoObservavel {


  EstadosOnibus estadoAtual;
  ArrayList<IObservador> observaveis;


  public Onibus(){
    this.estadoAtual = EstadosOnibus.SAIU_DA_GARAGEM;
    this.observaveis = new ArrayList<IObservador>();
  }

  @Override
  public void removeObservador(IObservador observador) {
    this.observaveis.remove(observador);    
  }

  @Override
  public void adicionaObservador(IObservador observador) {
      this.observaveis.add(observador);    
  }

  @Override
  public void notifique() {
    for (IObservador iObservador : observaveis) {
        iObservador.atualizaEstado(this.estadoAtual);
    } 
    
  }
  

  public void setEstado(EstadosOnibus estadoNovo){
    this.estadoAtual = estadoNovo;
    notifique();
  }



  
}
