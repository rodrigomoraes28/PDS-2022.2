import java.util.ArrayList;


//um tipo de observador (tem 2, onibus e aluno)
public class Onibus implements ISujeitoObservavel{


  ArrayList<IObservador> observadores;
  EstadosOnibus estadoAtual;  //esse tem os bgl enum (tipos de estado do onibus)

  public Onibus(){
    this.observadores = new ArrayList<IObservador>();
    this.estadoAtual = EstadosOnibus.CHEGOU_NA_UFC;
  }

  @Override
  public void adicionaObservador(IObservador observador) { //teria que ter um comparator aq mas nao precisa???
    this.observadores.add(observador);
  }

  @Override
  public void removeObservador(IObservador observador) {
    this.observadores.remove(observador);
  }


  //essa parte é a mais complicada
  @Override

  //EstadoOnibus é um tipo enum
  //IObservador é uma interface que contem a função atualizaEstado
  //Aluno e Prefeitura são classes concentras que implementam os metodos de IObservador
  //ISujeitoObservavel é uma interface que contem os metodo adicionaObservador,removeObservaor e nofique
  //Onibus contem os atributos do tipo EstadoOnibus e um arraylist do tipo IObservador e implementa o metodos de ISujeitoObservavel
  
  public void notifique() {
    for (IObservador iObservador : observadores) { //foreach do tipo IObservador pra precorrer os obsevadores (que sao quem implementa o IObsevador (nesse caso aluno e prefeitura) que são ConcretObserver)
          iObservador.atualizaEstado(this.estadoAtual);  // e aqui atualizou o estado nas classes que implementam o IObservador         (nesse caso aluno e prefeitura) que são ConcretObserver) que vao tar com o msm estado novo, e esse estado é mudado qnd vc da o setEstado (a classe abaixo dela ae, porque nela vc passa como parametro uma variavel do tipo EstadoOnibus que muda o valor do  this.estadoAtual(que é do tipo EstadosOnibus) )
    }
    
  }


  public void setEstado(EstadosOnibus estado){ 
    this.estadoAtual = estado; //aq muda o estado do onibus q vc vai passar na main como parametro
    this.notifique();       //aq chama a funcao nofitique
  }
  
}
