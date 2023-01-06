public interface ISujeitoObservavel {

  public void removeObservador(IObservavel obs);
  public void addObservador(IObservavel obs);
  public void notifica();
  
}
