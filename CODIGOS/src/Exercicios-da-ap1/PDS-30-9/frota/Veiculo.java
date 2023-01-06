public abstract class Veiculo implements ITemRodas{
 		//o abstract alem de nao ter que escrever os metodos da classe que ele implemnta, é abstract porque ele é uma classe pai dos outros veiculos

 	String chassi;
	int num_rodas;

	public Veiculo(String chassi){
		this.chassi = chassi;
	}
	
	public int leNumRodas(){
		return num_rodas;
}

	
	// @Override
	// public String toString() {
	// 	return this.chassi + " " + this.num_rodas;
	// }
	 
}
