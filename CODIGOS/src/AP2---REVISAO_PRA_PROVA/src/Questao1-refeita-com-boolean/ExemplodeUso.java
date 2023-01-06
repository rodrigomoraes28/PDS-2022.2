public class ExemplodeUso {
  

  public static void main(String[] args) {
    
    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
  }

  public void inicia(){ 


    Inscrito_Aluno aluno = new Inscrito_Aluno();
    Inscrito_Coordenadora coordenadora = new Inscrito_Coordenadora();
    Inscrito_Universidade universidade = new Inscrito_Universidade();
    Disciplina disciplina = new Disciplina();


    disciplina.setEstado(true);
    System.out.println("\n");
    disciplina.adicionaObservador(universidade);
    disciplina.adicionaObservador(coordenadora);
    disciplina.adicionaObservador(aluno);


    disciplina.notificar();




  }
}
