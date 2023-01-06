import java.util.ArrayList;

public class Frota {
	private ArrayList<Veiculo> veiculos;
	
	public Frota() {
		veiculos = new ArrayList<Veiculo>();
	}
	
	public int leNumeroRodas() {
		int rodas = 0;
		for (Veiculo v: veiculos) {
		 
		}
		return rodas;
	}
	
	public void adicionaVeiculo(Veiculo v){
		this.veiculos.add(v);
	}
}
