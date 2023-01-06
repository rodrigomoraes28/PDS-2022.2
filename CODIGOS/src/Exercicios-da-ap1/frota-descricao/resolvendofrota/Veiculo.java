
public abstract class Veiculo implements ItemRodas{

	String chassi;
    int numRodas;
	
	public Veiculo(String chassi){
		this.chassi = chassi;
	}
    
    public int leNumRodas(){
        return numRodas;
    }
}
