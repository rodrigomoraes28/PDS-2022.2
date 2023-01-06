public class ITeradorMinhaLista implements IIteradorMinhaArrayList {


  Object[] pessoas;
  int tamanho;
  int indice = tamanho;

  ITeradorMinhaLista(Object[] objeto_ex){
    this.pessoas = objeto_ex;
    this.tamanho = objeto_ex.length;
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
  public Pessoa iteratorReverso() {
    Pessoa paciente = (Pessoa)pessoas[indice];
    indice--;
    return paciente;
  }


  
  
}
