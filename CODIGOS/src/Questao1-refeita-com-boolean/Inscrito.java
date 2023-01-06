public abstract class Inscrito implements IObservador_Inscrito{  //abstração do q seria ObsevadorConcreto


  public void atualizaNotas(Boolean estadoAtual){

    if(estadoAtual == true) {
        System.out.println(this.getClass().getSimpleName()+ " foi atualizado");
    }


  }

  // @Override
  // public void atualizaNotas() {
  //   System.out.println(this.getClass().getSimpleName()+ " foi atualizado");
    
  // }
  
}
