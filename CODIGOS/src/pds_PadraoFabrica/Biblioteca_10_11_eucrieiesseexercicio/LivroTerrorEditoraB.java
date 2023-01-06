public class LivroTerrorEditoraB implements ILivro{



  @Override
  public String nomeLivro() {
    return "O Exorcista";
  }

  @Override
  public String nomeAutor() {
    return "William Peter Blatty";
  }

  @Override
  public int anoLivro() {
    return 1971;
  }

  @Override
  public int numeroPaginas() {
    return 336;
  }
   
  @Override
  public String toString() {
     return ("Informações a respeito do Livro: " + nomeLivro() + "\n Autor: " + nomeAutor() + "\n Ano de Lançamento: " + anoLivro() + "\n Número de Páginas: " + numeroPaginas());
  }

  
 
  
}
