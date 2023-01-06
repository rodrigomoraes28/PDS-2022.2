package Observer;

public interface ISujeitoObservador {


  public void addObservador(IObsever obs);
  public void removeObservador(IObsever obs);
  public void notifica();
}
