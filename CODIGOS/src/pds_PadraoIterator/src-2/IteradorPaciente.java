public class IteradorPaciente implements Interface_IteradorListaPaciente {

  Object[] paciente;
  int indice = 0;
  int tamanho;


  public IteradorPaciente(Object[] paciente_ex){
    this.paciente = paciente_ex;
    this.tamanho = paciente_ex.length;
  }



  @Override
  public boolean temProximo() {
    if(indice <= tamanho -1){
      return true;
    }
    else{
    return false;
  }
  }

  @Override
  public Paciente leProximo() {
    Paciente paciente_proximo = (Paciente)this.paciente[indice];
    indice++;
    return paciente_proximo;
  }
  
}
