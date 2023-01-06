public interface ISujeitoObservavel{


  public void removeObservador(IObservador observador);
  public void adicionaObservador(IObservador observador);
  public void notifica();

}