public class ExemplodeUso {

  public static void main(String[] args) {
    

    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
    
  }


  public void inicia(){

    ListaPaciente lista = new ListaPaciente();

    lista.addPaciente(new Paciente("Fulano"));
    lista.addPaciente(new Paciente("Cicrano"));
    lista.addPaciente(new Paciente("Beutrano"));

    Interface_IteradorListaPaciente iterator = lista.criaIterador();

    while(iterator.temProximo()){

      System.out.println("Paciente: " + iterator.leProximo().getNome() + "\n");

    }

  }
  
}
