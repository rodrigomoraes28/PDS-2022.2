import java.util.ArrayList;

public class Disciplina implements ISujeitoObservavel{

  boolean estadoAtual;
  ArrayList<IObservador_Inscrito> inscrito;

  public Disciplina(){
    estadoAtual = false;
    this.inscrito = new ArrayList<IObservador_Inscrito>();
  }

  @Override
  public void removeObservador(IObservador_Inscrito observador) {
    this.inscrito.remove(observador);
  }

  @Override
  public void adicionaObservador(IObservador_Inscrito observador) {
    this.inscrito.add(observador);   
  }

  @Override
  public void notificar() {
  for (IObservador_Inscrito iObservador_Inscrito : inscrito) {
    iObservador_Inscrito.atualizaNotas(this.estadoAtual);
  }
    
  }


  public void setEstado(Boolean estadoNovo){
    this.estadoAtual = estadoNovo;
    notificar();
  }



  
}
