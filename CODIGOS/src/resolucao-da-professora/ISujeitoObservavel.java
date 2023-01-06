
public interface ISujeitoObservavel {
	public void adicionaObservador(IObservador observador);
	public void removeObservador(IObservador observador);
	public void notifique();
}
