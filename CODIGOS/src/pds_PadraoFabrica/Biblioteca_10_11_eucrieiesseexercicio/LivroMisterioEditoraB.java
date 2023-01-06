public class LivroMisterioEditoraB implements ILivro{

  @Override
  public String nomeLivro() {
    return "A Garota do Lago";
  }

  @Override
  public String nomeAutor() {
    return "Charlie Donlea";
  }

  @Override
  public int anoLivro() {
    return 2017;
  }

  @Override
  public int numeroPaginas() {
    return 296;
  }


  @Override
  public String toString() {
     return ("Informações a respeito do Livro: " + nomeLivro() + "\n Autor: " + nomeAutor() + "\n Ano de Lançamento: " + anoLivro() + "\n Número de Páginas: " + numeroPaginas());
  }
 
  
}
 