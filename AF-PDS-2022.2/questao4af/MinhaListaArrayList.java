import util.MinhaArrayList;

public class MinhaListaArrayList implements IAgregadorMinhaArrayList {
 
  public MinhaArrayList<Pessoa> minhalista;
  public Pessoa pessoas;
 
  public MinhaListaArrayList(){
      this.minhalista = new MinhaArrayList<Pessoa>();
  }


  public void addPessoa(Pessoa pessoa){
    this.minhalista.add(pessoa);
  } 
  

  @Override
  public IIteradorMinhaArrayList criaIterador() {
    
    return new ITeradorMinhaArrayList(this.pessoas.toArray());
  }
  
}
