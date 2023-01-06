public abstract class Veiculo implements ItemRodas {

  private String chassi; //parece que é o ID do carro
	protected int rodas; //aqui ja n entendi qual motivo disso existir
	
	public Veiculo(String chassi){
		this.chassi = chassi;
	}

	public int getRodas() {
		return this.rodas;
	}

	public String getChassi() {
		return this.chassi;
	}
	@Override
	public String toString() {
		return this.chassi + " " + this.rodas;
	}
}
