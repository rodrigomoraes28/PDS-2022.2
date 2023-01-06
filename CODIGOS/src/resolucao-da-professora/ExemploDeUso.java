
public class ExemploDeUso {

	public static void main(String[] args) {
 		ExemploDeUso exemplo = new ExemploDeUso();
		exemplo.inicia();
	}
	
	public void inicia(){
		//criar um Onibus
		Onibus onibus = new Onibus();
		
		
		// criar um aluno
		Aluno aluno = new Aluno();
		// criar prefeitura
		Prefeitura prefeitura  = new Prefeitura();
		
		
		// adicionar os observadores
		onibus.adicionaObservador(aluno);
		onibus.adicionaObservador(prefeitura);
		
		//trocar de estado
		onibus.setEstado(EstadosOnibus.CHEGOU_NA_UFC);
		
		//trocar de estado
		onibus.setEstado(EstadosOnibus.SAIU_DA_UFC);
		onibus.setEstado(EstadosOnibus.CHEGOU_NA_PRACA);
		onibus.setEstado(EstadosOnibus.SAIU_DA_PRACA);
	}

}
