package Questao1;

public interface ISujeitoObservavel {


  public void addObservador(IObservador obs);
  public void removeObservador(IObservador obs);
  public void notifica();
  
}
