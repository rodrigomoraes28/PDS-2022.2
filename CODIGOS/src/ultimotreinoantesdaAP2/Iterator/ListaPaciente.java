package Iterator;

import java.util.ArrayList;

public class ListaPaciente implements IAgregadorListaPaciente{


  ArrayList<Paciente> pacientes;


  ListaPaciente(){
    pacientes = new ArrayList<Paciente>();


  }
  @Override
  public Interface_Iterador criaIterator() {
    // TODO Auto-generated method stub
    return new IteradorListaPaciente(this.pacientes.toArray());
  }
  
}
