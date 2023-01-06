import java.util.ArrayList;

public class Onibus implements ISujeitoObservavel{

  EstadosOnibus estadoAtual;
  ArrayList<IObservador> observadores;


  public Onibus(){
    this.observadores = new ArrayList<IObservador>();
    this.estadoAtual = EstadosOnibus.CHEGOU_NA_UFC;
  }

  @Override
  public void adicionaObservador(IObservador observador) {
    this.observadores.add(observador);    
  }

  @Override
  public void removeObservador(IObservador observador) {
    this.observadores.remove(observador);    
  }

  //esse daqui
  @Override
  public void notifique() { //aq vc notifica ou seja muda o valor do atributo IObservador que tem nas classes concetras q implementam o IObservador (aluno e prefeitura) para o novo estado, que no caso é mudado pela função setEstado
    //essa funcao nao retorna nada pois ela é void, ela é chamada so no setEstado quando se muda o estado do onibus
    
    for (IObservador iObservador : observadores) { //percorre o arraylist
        iObservador.atualizaEstadoOnibus(this.estadoAtual); //e chama a funcao que atualiza o estado e poe la pro atributo la em cima da classe
    }    
  }

  //e esse debaixo que tem q decorar
  public void setEstado(EstadosOnibus estadoMudar){
    this.estadoAtual = estadoMudar;
    notifique();
  }
  
}
