public class LivroMisterioEditoraA implements ILivro{


    @Override
    public String nomeLivro() {
      return "  O Assassinato No Expresso Oriente";
    }
  
    @Override
    public String nomeAutor() {
      return "Agatha Christie";
    }
  
    @Override
    public int anoLivro() {
      return 1934;
    }
  
    @Override
    public int numeroPaginas() {
      return 204 ;
    }
  
    @Override
    public String toString() {
       return ("Informações a respeito do Livro: " + nomeLivro() + "\n Autor: " + nomeAutor() + "\n Ano de Lançamento: " + anoLivro() + "\n Número de Páginas: " + numeroPaginas());
    }
   
    
  }
   