 
public class ExemplodeUso {

  public static void main(String[] args) {

    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
    
  }


  public void inicia(){

    //ja eh iniciado o onibus no estado que ta no construtor
    Onibus onibus = new Onibus();

    Garagem garagem = new Garagem();
    Aluno aluno = new Aluno();
    Prefeitura prefeitura = new Prefeitura();

    onibus.adicionaObservador(garagem);
    onibus.adicionaObservador(prefeitura);
    onibus.adicionaObservador(aluno);

    //mudando de estado
    //podia por 1 observador garagem tambem


    //1-> saiu da garagem (nao imprime nada)
    //2-> chegou na praca (nao imprime nada)
    //3-> saiu da praca -> imprime: ("Quantidade de viagens 1")
    //4-> chegou na ufc imprime -> ("Corre POVO!!!")
    //5-> saiu da ufc -> imprime: ("Quantidade de viagens 2")
    //6-> chegou na praca (nao imprime nada)
    //7-> chegou na garagem -> imprime: ("Dias de Viagem: 1")


    
    
    onibus.setEstado(EstadosOnibus.CHEGOU_NA_PRACA);
    onibus.setEstado(EstadosOnibus.SAIU_DA_PRACA);
    onibus.setEstado(EstadosOnibus.CHEGOU_NA_UFC); //--
    onibus.setEstado(EstadosOnibus.SAIU_DA_UFC);
    onibus.setEstado(EstadosOnibus.CHEGOU_NA_PRACA);
    onibus.setEstado(EstadosOnibus.CHEGOU_NA_GARAGEM);
      
  }
  
}
