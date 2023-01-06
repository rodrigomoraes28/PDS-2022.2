public abstract class Veiculo implements ITemRodas{
    //o abstract alem de nao ter que escrever os metodos da classe que ele implemnta, é abstract porque ele   é uma classe pai dos outros veiculos

	String chassi;
    int numRodas;
	
	public Veiculo(String chassi){
		this.chassi = chassi;
	}
    
    public int leNumRodas(){
        return numRodas;
    }
}
