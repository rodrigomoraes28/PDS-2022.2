public abstract class Inscrito implements IObservador_Inscrito{  //abstração do q seria ObsevadorConcreto

  @Override
  public void atualizaNotas() {
    System.out.println(this.getClass().getSimpleName()+ " foi atualizado");
    
  }
  
}
