import java.util.ArrayList;

public class ListaPaciente implements IAgregadorListaPaciente{


  ArrayList<Paciente> pacientes;

  public ListaPaciente(){
    pacientes = new ArrayList<Paciente>();
  }


  public void addPaciente(Paciente paciente){
    this.pacientes.add(paciente);
  }

  @Override
  public Interface_IteradorListaPaciente criaIterador() {
     
    return new IteradorPaciente(this.pacientes.toArray()); //aq o pacientes que ta num arraylist de Paciente eh transformado em um array, por isso vem o Nomedaclasse(nomedoarraylist.toarray()) e tb so funciona pq no construtor do IteradorPaciente tem la como Object[] pacientes , e dae ele vai pra la como um object[] q nada mais eh do q um array por causa desses colchetes
  }
  
}
