
public class Prefeitura implements IObservador{
	int quantidadeViagens = 0; //idas
	public void atualizaEstado(EstadosOnibus estadoAtual){
		if((estadoAtual.equals(EstadosOnibus.SAIU_DA_UFC)) ||
				(estadoAtual.equals(EstadosOnibus.SAIU_DA_PRACA))){
			this.quantidadeViagens ++;
			System.out.println("Adicionou um trecho de viagem" + quantidadeViagens);
		}
	}

}
