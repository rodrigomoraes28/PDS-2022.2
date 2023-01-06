public class ExemplodeUso {

  public static void main(String[] args) {

    ExemplodeUso exemplodeUso = new ExemplodeUso();
    exemplodeUso.inicia();
    
  }

  public void inicia(){

    ListaPaciente lista = new ListaPaciente();
    lista.addPaciente(new Paciente("Andre"));
    lista.addPaciente(new Paciente("Paulyne"));
    lista.addPaciente(new Paciente("Thiago"));
    lista.addPaciente(new Paciente("Arthur"));

    //percorrendo a lista
    Interface_IteradorListaPaciente iterator = lista.criaIterator();
    //como o ListaPaciente tem um metodo do tipo Interface_IteradorListaPaciente é possível atribuir o retorno desse metodo ao iterador do tipo Interface_Iterador ....   
    // aq o metodo dentro da classe ListaPaciente 
    //public Interface_IteradorListaPaciente criaIterator() {


    while(iterator.temProximo()){
      // System.out.println("\n");
      // System.out.println("Pega o atual : " + iterator.atual().getNome());

      System.out.println("\n");
      System.out.println("Le proximo : " + iterator.leProximo().getNome());

      System.out.println("\n");
      System.out.println("Pega o primeiro : " + iterator.primeiro().getNome());
      // System.out.println("\n");

    }

  }
  
}
