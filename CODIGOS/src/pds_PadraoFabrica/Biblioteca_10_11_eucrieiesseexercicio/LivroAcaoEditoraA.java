public class LivroAcaoEditoraA implements ILivro{

  @Override
  public String nomeLivro() {
    return "Tomb Raider: Os Dez Mil Imortais";
  }

  @Override
  public String nomeAutor() {
    return "Dan Abnett";
  }

  @Override
  public int anoLivro() {
    return 2014;
  }

  @Override
  public int numeroPaginas() {
    return 224;
  }

  @Override
  public String toString() {
     return ("Informações a respeito do Livro: " + nomeLivro() + "\n Autor: " + nomeAutor() + "\n Ano de Lançamento: " + anoLivro() + "\n Número de Páginas: " + numeroPaginas());
  }
 
  
}
