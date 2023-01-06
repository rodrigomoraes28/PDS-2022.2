package Observer2;

public interface ISujeitoObservavel {

  public void addObservador(IObserver obs);
  public void removeObservador(IObserver obs);
  public void notifica();
}
