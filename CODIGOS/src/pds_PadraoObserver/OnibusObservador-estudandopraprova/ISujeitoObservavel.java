public interface ISujeitoObservavel {

  public void adicionaObservador(IObservador estadoAtual);
  public void removeObservador(IObservador estadoAtual);
  public void notifique();
  
}
