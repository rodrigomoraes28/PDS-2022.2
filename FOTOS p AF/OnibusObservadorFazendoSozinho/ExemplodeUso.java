public class ExemplodeUso {


  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();

  }
    public void inicia(){

      Onibus onibus = new Onibus();

      Aluno aluno = new Aluno();
      Prefeitura prefeitura = new Prefeitura();

      onibus.addObservador(prefeitura);
      onibus.addObservador(aluno);

      onibus.mudaEstado(EstadosOnibus.SAIU_DA_PRACA);

    }


  }
  
 
