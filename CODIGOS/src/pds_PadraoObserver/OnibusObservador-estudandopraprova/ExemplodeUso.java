 

public class ExemplodeUso {

  public static void main(String[] args) {

    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
    
  }


  public void inicia(){

    //ja eh iniciado o onibus no estado que ta no construtor
    Onibus onibus = new Onibus();

    Aluno aluno = new Aluno();
    Prefeitura prefeitura = new Prefeitura();

    onibus.adicionaObservador(aluno);
    onibus.adicionaObservador(prefeitura);

    //mudando de estado

    
  //trocar de estado
  onibus.setEstado(EstadosOnibus.CHEGOU_NA_UFC);
 
  //trocar de estado
  onibus.setEstado(EstadosOnibus.SAIU_DA_UFC);
  onibus.setEstado(EstadosOnibus.CHEGOU_NA_PRACA);
  onibus.setEstado(EstadosOnibus.SAIU_DA_PRACA);

  onibus.setEstado(EstadosOnibus.CHEGOU_NA_UFC);

  onibus.setEstado(EstadosOnibus.SAIU_DA_UFC);



  }
  
}
