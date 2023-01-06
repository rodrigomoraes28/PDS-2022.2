import java.util.ArrayList;

public class LojaDeAcessorios {
	private ArrayList<Acessorio> acessorios;
	
	public LojaDeAcessorios() {
		acessorios = new ArrayList<Acessorio>();
	}
	
	public float leValorTotal() {
		float valor = 0;
		for (Acessorio a: acessorios) {
			valor = valor + a.getValor();
		}
		return valor;
	}
	
	public void adicionaAcessorio(Acessorio acessorio){
		this.acessorios.add(acessorio);
	}
}
