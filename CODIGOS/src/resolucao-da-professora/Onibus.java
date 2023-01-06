import java.util.ArrayList;

public class Onibus implements ISujeitoObservavel{

	ArrayList<IObservador> observadores;
	EstadosOnibus estadoAtual;
	
	public Onibus(){
		this.observadores = new ArrayList<IObservador>();
		this.estadoAtual = EstadosOnibus.CHEGOU_NA_UFC;
	}
	
	public void adicionaObservador(IObservador observador){
		this.observadores.add(observador);
	}
	public void removeObservador(IObservador observador){
		this.observadores.remove(observador);
	}
	public void notifique(){
		for (IObservador iObservador : observadores) {
			iObservador.atualizaEstado(this.estadoAtual);
		}
	}
	
	public void setEstado(EstadosOnibus estado){
		this.estadoAtual = estado;
		this.notifique();
	}
}
