public class LivroAcaoEditoraB implements ILivro{

  @Override
  public String nomeLivro() {
    return "Percy Jackson O Ladrão de Raios";
  }

  @Override
  public String nomeAutor() {
    return "Rick Riordan";
  }

  @Override
  public int anoLivro() {
    return 2005;
  }

  @Override
  public int numeroPaginas() {
    return 400;
  }

  @Override
  public String toString() {
     return ("Informações a respeito do Livro: " + nomeLivro() + "\n Autor: " + nomeAutor() + "\n Ano de Lançamento: " + anoLivro() + "\n Número de Páginas: " + numeroPaginas());
  }
 
  
}
