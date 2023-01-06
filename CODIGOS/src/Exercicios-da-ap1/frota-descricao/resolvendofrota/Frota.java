import java.util.ArrayList;

public class Frota {
    Funciona gerente;
	private ArrayList<Veiculo> veiculos;
	
	public Frota() {
		veiculos = new ArrayList<Veiculo>();
	}
	
	public int leNumeroRodas() {
		int rodas = 0;
		for (Veiculo v: veiculos) {
			rodas += v.leNumeroRodas();
		}
		return rodas;
	}
    
    public void setGerente(Funcionario gerente){
        this.gerente = gerente;
    }
	
	public void adicionaVeiculo(String chassi, String tipo,Funciona funcionarioQuePediu){
        if(funcionarioQuePediu.equals(this.gerente)){
            this.veiculos.add(FabricaVeiculo.criaVeiculo(chassi,tipo));
        }
	}
    
    
    
    /*public void adicionaVeiculaNaFrota(String chassi, String tipo, Frota frota){
		if( this.cargo.equals("Gerente")){
			frota.adicionaVeiculo(new Veiculo(chassi,tipo));
		}
	}*/
}
