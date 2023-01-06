public interface ISujeitoObservavel{

  public void removeObservador(IObservador_Inscrito observador);
  public void adicionaObservador(IObservador_Inscrito observador);
  public void notificar();

}