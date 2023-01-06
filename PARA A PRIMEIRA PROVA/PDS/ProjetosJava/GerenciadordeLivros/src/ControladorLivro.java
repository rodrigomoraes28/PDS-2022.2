public class ControladorLivro{

    RepositorioLivro repositorioLivro;

      public ControladorLivro(){
        repositorioLivro = new RepositorioLivro();
      }  

      public boolean adicionarLivro(String nome, String ISBN, String autor){
            Livro livro = new Livro(nome, ISBN, autor);
            return repositorioLivro.adicionarLivro(livro);
      }
  }