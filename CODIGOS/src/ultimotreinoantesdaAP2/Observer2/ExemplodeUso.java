package Observer2;

public class ExemplodeUso {


  public static void main(String[] args) {
    
  ExemplodeUso exemplodeUso = new ExemplodeUso();
  exemplodeUso.inicia();
  
  }
 
  public void inicia(){
 
    Aluno aluno = new Aluno();
    Prefeitura prefeitura = new Prefeitura();
    Onibus onibus = new Onibus();


    onibus.addObservador(prefeitura);
    onibus.addObservador(aluno);

    onibus.setEstadoAtual(EstadosOnibus.CHEGOU_NA_PRACA);
    onibus.setEstadoAtual(EstadosOnibus.SAIU_DA_PRACA);
    onibus.setEstadoAtual(EstadosOnibus.SAIU_DA_UFC);


      

  }
}


