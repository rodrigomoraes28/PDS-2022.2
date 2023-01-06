import java.util.ArrayList;

public class ListaPaciente implements IAgregadorListaPaciente{

  ArrayList<Paciente> pacientes;

  public ListaPaciente(){
    pacientes = new ArrayList<Paciente>();
  }

  public void addPaciente(Paciente paciente_add){
    this.pacientes.add(paciente_add);
  }

  @Override
  public Interface_IteradorListaPaciente criaIterator() {
    return new ITeradorListaPaciente(this.pacientes.toArray()); //vai transformar o arraylist ali de ArrayList<Paciente> pra um tipo de array (vetor seila como fala, mas a q eh array) pra poder trabalhar com ele e seus indexs
  }
 
  
}

 