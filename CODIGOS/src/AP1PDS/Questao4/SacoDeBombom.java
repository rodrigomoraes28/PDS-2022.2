public class SacoDeBombom {

	String tipo;
	String marca;
	int qtd_bombons;

	
	public SacoDeBombom(String marca, String tipo,int qtd){
		this.marca = marca;
		this.tipo = tipo;
		this.qtd_bombons = qtd;
	}
	
	public int getQtd_bombons() {
		return qtd_bombons;
	}

	public String leTipo(){
		return this.tipo;
	}
}
