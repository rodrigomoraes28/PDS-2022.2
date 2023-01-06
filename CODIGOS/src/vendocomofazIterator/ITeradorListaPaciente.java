public class ITeradorListaPaciente implements Interface_IteradorListaPaciente {

  Object[] pacientes; //importante saber aq como instanciar um array
  int indice = 0;
  int tamanho;

  public ITeradorListaPaciente(Object[] pacientes_ex){ //aq isntancia as paradas, eh facil
    this.pacientes = pacientes_ex;
    this.tamanho = pacientes_ex.length;
  }

  @Override
  public boolean temProximo() { //aq so ve se o indice é igual ou menor q o tamanho -1, se for é vdd se nao chegou no fim
    if(indice <= tamanho -1){
      return true;
    }
    else{
     return false;
    }
  }

  @Override
  public Paciente leProximo() {
    Paciente paciente_prox = (Paciente)this.pacientes[indice]; //esse indice eh o instanciado la em cima
    indice++;
    return paciente_prox;
  }


  @Override
  public Paciente primeiro() {
    int indice_primeiro = 0;
    Paciente paciente_primeiro = (Paciente)this.pacientes[indice_primeiro];
    return paciente_primeiro;
  }

  @Override
  public Paciente atual() {
    Paciente paciente_atual = (Paciente)this.pacientes[indice];
    return paciente_atual;
  }

  //e poderia ter o leAnterior se quissese, so q o indice seria indice-- em vez de ++
 




  

  
}
 