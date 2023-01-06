import java.util.ArrayList;

public class Disciplina implements ISujeitoObservavel{


  ArrayList<IObservador_Inscrito> inscrito;

  public Disciplina(){
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
    iObservador_Inscrito.atualizaNotas();
  }
    
  }



  
}
